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

@Tag("29")
class Record_366 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 366: FirstName is Alphonse")
	void FirstNameOfRecord366() {
		assertEquals("Alphonse", customers.get(365).getFirstName());
	}

	@Test
	@DisplayName("Record 366: LastName is Hanes")
	void LastNameOfRecord366() {
		assertEquals("Hanes", customers.get(365).getLastName());
	}

	@Test
	@DisplayName("Record 366: Company is Seaver, Mitchell A Esq")
	void CompanyOfRecord366() {
		assertEquals("Seaver, Mitchell A Esq", customers.get(365).getCompany());
	}

	@Test
	@DisplayName("Record 366: Address is 80 Jefferson Ave")
	void AddressOfRecord366() {
		assertEquals("80 Jefferson Ave", customers.get(365).getAddress());
	}

	@Test
	@DisplayName("Record 366: City is Deer Park")
	void CityOfRecord366() {
		assertEquals("Deer Park", customers.get(365).getCity());
	}

	@Test
	@DisplayName("Record 366: County is Suffolk")
	void CountyOfRecord366() {
		assertEquals("Suffolk", customers.get(365).getCounty());
	}

	@Test
	@DisplayName("Record 366: State is NY")
	void StateOfRecord366() {
		assertEquals("NY", customers.get(365).getState());
	}

	@Test
	@DisplayName("Record 366: ZIP is 11729")
	void ZIPOfRecord366() {
		assertEquals("11729", customers.get(365).getZIP());
	}

	@Test
	@DisplayName("Record 366: Phone is 631-243-4010")
	void PhoneOfRecord366() {
		assertEquals("631-243-4010", customers.get(365).getPhone());
	}

	@Test
	@DisplayName("Record 366: Fax is 631-243-3327")
	void FaxOfRecord366() {
		assertEquals("631-243-3327", customers.get(365).getFax());
	}

	@Test
	@DisplayName("Record 366: Email is alphonse@hanes.com")
	void EmailOfRecord366() {
		assertEquals("alphonse@hanes.com", customers.get(365).getEmail());
	}

	@Test
	@DisplayName("Record 366: Web is http://www.alphonsehanes.com")
	void WebOfRecord366() {
		assertEquals("http://www.alphonsehanes.com", customers.get(365).getWeb());
	}
}
