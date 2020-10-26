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

@Tag("4")
class Record_2103 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2103: FirstName is Eleanore")
	void FirstNameOfRecord2103() {
		assertEquals("Eleanore", customers.get(2102).getFirstName());
	}

	@Test
	@DisplayName("Record 2103: LastName is Follette")
	void LastNameOfRecord2103() {
		assertEquals("Follette", customers.get(2102).getLastName());
	}

	@Test
	@DisplayName("Record 2103: Company is Ghose, Mony R Esq")
	void CompanyOfRecord2103() {
		assertEquals("Ghose, Mony R Esq", customers.get(2102).getCompany());
	}

	@Test
	@DisplayName("Record 2103: Address is 22313 Worcester Dr")
	void AddressOfRecord2103() {
		assertEquals("22313 Worcester Dr", customers.get(2102).getAddress());
	}

	@Test
	@DisplayName("Record 2103: City is Novi")
	void CityOfRecord2103() {
		assertEquals("Novi", customers.get(2102).getCity());
	}

	@Test
	@DisplayName("Record 2103: County is Oakland")
	void CountyOfRecord2103() {
		assertEquals("Oakland", customers.get(2102).getCounty());
	}

	@Test
	@DisplayName("Record 2103: State is MI")
	void StateOfRecord2103() {
		assertEquals("MI", customers.get(2102).getState());
	}

	@Test
	@DisplayName("Record 2103: ZIP is 48374")
	void ZIPOfRecord2103() {
		assertEquals("48374", customers.get(2102).getZIP());
	}

	@Test
	@DisplayName("Record 2103: Phone is 248-380-6644")
	void PhoneOfRecord2103() {
		assertEquals("248-380-6644", customers.get(2102).getPhone());
	}

	@Test
	@DisplayName("Record 2103: Fax is 248-380-6144")
	void FaxOfRecord2103() {
		assertEquals("248-380-6144", customers.get(2102).getFax());
	}

	@Test
	@DisplayName("Record 2103: Email is eleanore@follette.com")
	void EmailOfRecord2103() {
		assertEquals("eleanore@follette.com", customers.get(2102).getEmail());
	}

	@Test
	@DisplayName("Record 2103: Web is http://www.eleanorefollette.com")
	void WebOfRecord2103() {
		assertEquals("http://www.eleanorefollette.com", customers.get(2102).getWeb());
	}
}
