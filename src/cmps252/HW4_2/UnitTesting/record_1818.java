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

@Tag("31")
class Record_1818 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1818: FirstName is Juanita")
	void FirstNameOfRecord1818() {
		assertEquals("Juanita", customers.get(1817).getFirstName());
	}

	@Test
	@DisplayName("Record 1818: LastName is Grae")
	void LastNameOfRecord1818() {
		assertEquals("Grae", customers.get(1817).getLastName());
	}

	@Test
	@DisplayName("Record 1818: Company is Energy Industries")
	void CompanyOfRecord1818() {
		assertEquals("Energy Industries", customers.get(1817).getCompany());
	}

	@Test
	@DisplayName("Record 1818: Address is 50 Oser Ave")
	void AddressOfRecord1818() {
		assertEquals("50 Oser Ave", customers.get(1817).getAddress());
	}

	@Test
	@DisplayName("Record 1818: City is Hauppauge")
	void CityOfRecord1818() {
		assertEquals("Hauppauge", customers.get(1817).getCity());
	}

	@Test
	@DisplayName("Record 1818: County is Suffolk")
	void CountyOfRecord1818() {
		assertEquals("Suffolk", customers.get(1817).getCounty());
	}

	@Test
	@DisplayName("Record 1818: State is NY")
	void StateOfRecord1818() {
		assertEquals("NY", customers.get(1817).getState());
	}

	@Test
	@DisplayName("Record 1818: ZIP is 11788")
	void ZIPOfRecord1818() {
		assertEquals("11788", customers.get(1817).getZIP());
	}

	@Test
	@DisplayName("Record 1818: Phone is 631-234-3463")
	void PhoneOfRecord1818() {
		assertEquals("631-234-3463", customers.get(1817).getPhone());
	}

	@Test
	@DisplayName("Record 1818: Fax is 631-234-8509")
	void FaxOfRecord1818() {
		assertEquals("631-234-8509", customers.get(1817).getFax());
	}

	@Test
	@DisplayName("Record 1818: Email is juanita@grae.com")
	void EmailOfRecord1818() {
		assertEquals("juanita@grae.com", customers.get(1817).getEmail());
	}

	@Test
	@DisplayName("Record 1818: Web is http://www.juanitagrae.com")
	void WebOfRecord1818() {
		assertEquals("http://www.juanitagrae.com", customers.get(1817).getWeb());
	}
}
