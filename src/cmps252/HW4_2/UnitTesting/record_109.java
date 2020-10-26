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

@Tag("46")
class Record_109 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 109: FirstName is Seth")
	void FirstNameOfRecord109() {
		assertEquals("Seth", customers.get(108).getFirstName());
	}

	@Test
	@DisplayName("Record 109: LastName is Kohnke")
	void LastNameOfRecord109() {
		assertEquals("Kohnke", customers.get(108).getLastName());
	}

	@Test
	@DisplayName("Record 109: Company is B & C Auto Wreckers")
	void CompanyOfRecord109() {
		assertEquals("B & C Auto Wreckers", customers.get(108).getCompany());
	}

	@Test
	@DisplayName("Record 109: Address is 142 Sw 5th Ave")
	void AddressOfRecord109() {
		assertEquals("142 Sw 5th Ave", customers.get(108).getAddress());
	}

	@Test
	@DisplayName("Record 109: City is Homestead")
	void CityOfRecord109() {
		assertEquals("Homestead", customers.get(108).getCity());
	}

	@Test
	@DisplayName("Record 109: County is Miami-Dade")
	void CountyOfRecord109() {
		assertEquals("Miami-Dade", customers.get(108).getCounty());
	}

	@Test
	@DisplayName("Record 109: State is FL")
	void StateOfRecord109() {
		assertEquals("FL", customers.get(108).getState());
	}

	@Test
	@DisplayName("Record 109: ZIP is 33030")
	void ZIPOfRecord109() {
		assertEquals("33030", customers.get(108).getZIP());
	}

	@Test
	@DisplayName("Record 109: Phone is 305-247-2570")
	void PhoneOfRecord109() {
		assertEquals("305-247-2570", customers.get(108).getPhone());
	}

	@Test
	@DisplayName("Record 109: Fax is 305-247-6758")
	void FaxOfRecord109() {
		assertEquals("305-247-6758", customers.get(108).getFax());
	}

	@Test
	@DisplayName("Record 109: Email is seth@kohnke.com")
	void EmailOfRecord109() {
		assertEquals("seth@kohnke.com", customers.get(108).getEmail());
	}

	@Test
	@DisplayName("Record 109: Web is http://www.sethkohnke.com")
	void WebOfRecord109() {
		assertEquals("http://www.sethkohnke.com", customers.get(108).getWeb());
	}
}
