package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("40")
class Record_2733 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2733: FirstName is Essie")
	void FirstNameOfRecord2733() {
		assertEquals("Essie", customers.get(2732).getFirstName());
	}

	@Test
	@DisplayName("Record 2733: LastName is Rasnic")
	void LastNameOfRecord2733() {
		assertEquals("Rasnic", customers.get(2732).getLastName());
	}

	@Test
	@DisplayName("Record 2733: Company is Kerrick, David E Esq")
	void CompanyOfRecord2733() {
		assertEquals("Kerrick, David E Esq", customers.get(2732).getCompany());
	}

	@Test
	@DisplayName("Record 2733: Address is 131 E Main")
	void AddressOfRecord2733() {
		assertEquals("131 E Main", customers.get(2732).getAddress());
	}

	@Test
	@DisplayName("Record 2733: City is Colfax")
	void CityOfRecord2733() {
		assertEquals("Colfax", customers.get(2732).getCity());
	}

	@Test
	@DisplayName("Record 2733: County is McLean")
	void CountyOfRecord2733() {
		assertEquals("McLean", customers.get(2732).getCounty());
	}

	@Test
	@DisplayName("Record 2733: State is IL")
	void StateOfRecord2733() {
		assertEquals("IL", customers.get(2732).getState());
	}

	@Test
	@DisplayName("Record 2733: ZIP is 61728")
	void ZIPOfRecord2733() {
		assertEquals("61728", customers.get(2732).getZIP());
	}

	@Test
	@DisplayName("Record 2733: Phone is 309-723-1603")
	void PhoneOfRecord2733() {
		assertEquals("309-723-1603", customers.get(2732).getPhone());
	}

	@Test
	@DisplayName("Record 2733: Fax is 309-723-0442")
	void FaxOfRecord2733() {
		assertEquals("309-723-0442", customers.get(2732).getFax());
	}

	@Test
	@DisplayName("Record 2733: Email is essie@rasnic.com")
	void EmailOfRecord2733() {
		assertEquals("essie@rasnic.com", customers.get(2732).getEmail());
	}

	@Test
	@DisplayName("Record 2733: Web is http://www.essierasnic.com")
	void WebOfRecord2733() {
		assertEquals("http://www.essierasnic.com", customers.get(2732).getWeb());
	}
}
