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

@Tag("39")
class Record_433 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 433: FirstName is Leonardo")
	void FirstNameOfRecord433() {
		assertEquals("Leonardo", customers.get(432).getFirstName());
	}

	@Test
	@DisplayName("Record 433: LastName is Gidwani")
	void LastNameOfRecord433() {
		assertEquals("Gidwani", customers.get(432).getLastName());
	}

	@Test
	@DisplayName("Record 433: Company is Acorn Computer Graphics")
	void CompanyOfRecord433() {
		assertEquals("Acorn Computer Graphics", customers.get(432).getCompany());
	}

	@Test
	@DisplayName("Record 433: Address is 26 Jackson Mills Rd")
	void AddressOfRecord433() {
		assertEquals("26 Jackson Mills Rd", customers.get(432).getAddress());
	}

	@Test
	@DisplayName("Record 433: City is Freehold")
	void CityOfRecord433() {
		assertEquals("Freehold", customers.get(432).getCity());
	}

	@Test
	@DisplayName("Record 433: County is Monmouth")
	void CountyOfRecord433() {
		assertEquals("Monmouth", customers.get(432).getCounty());
	}

	@Test
	@DisplayName("Record 433: State is NJ")
	void StateOfRecord433() {
		assertEquals("NJ", customers.get(432).getState());
	}

	@Test
	@DisplayName("Record 433: ZIP is 7728")
	void ZIPOfRecord433() {
		assertEquals("7728", customers.get(432).getZIP());
	}

	@Test
	@DisplayName("Record 433: Phone is 732-462-6239")
	void PhoneOfRecord433() {
		assertEquals("732-462-6239", customers.get(432).getPhone());
	}

	@Test
	@DisplayName("Record 433: Fax is 732-462-3979")
	void FaxOfRecord433() {
		assertEquals("732-462-3979", customers.get(432).getFax());
	}

	@Test
	@DisplayName("Record 433: Email is leonardo@gidwani.com")
	void EmailOfRecord433() {
		assertEquals("leonardo@gidwani.com", customers.get(432).getEmail());
	}

	@Test
	@DisplayName("Record 433: Web is http://www.leonardogidwani.com")
	void WebOfRecord433() {
		assertEquals("http://www.leonardogidwani.com", customers.get(432).getWeb());
	}
}
