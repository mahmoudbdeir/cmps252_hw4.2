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

@Tag("43")
class Record_1601 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1601: FirstName is Jordon")
	void FirstNameOfRecord1601() {
		assertEquals("Jordon", customers.get(1600).getFirstName());
	}

	@Test
	@DisplayName("Record 1601: LastName is Pacella")
	void LastNameOfRecord1601() {
		assertEquals("Pacella", customers.get(1600).getLastName());
	}

	@Test
	@DisplayName("Record 1601: Company is Huffmans Welding Works")
	void CompanyOfRecord1601() {
		assertEquals("Huffmans Welding Works", customers.get(1600).getCompany());
	}

	@Test
	@DisplayName("Record 1601: Address is 3661 W Blue Heron Blvd")
	void AddressOfRecord1601() {
		assertEquals("3661 W Blue Heron Blvd", customers.get(1600).getAddress());
	}

	@Test
	@DisplayName("Record 1601: City is West Palm Beach")
	void CityOfRecord1601() {
		assertEquals("West Palm Beach", customers.get(1600).getCity());
	}

	@Test
	@DisplayName("Record 1601: County is Palm Beach")
	void CountyOfRecord1601() {
		assertEquals("Palm Beach", customers.get(1600).getCounty());
	}

	@Test
	@DisplayName("Record 1601: State is FL")
	void StateOfRecord1601() {
		assertEquals("FL", customers.get(1600).getState());
	}

	@Test
	@DisplayName("Record 1601: ZIP is 33404")
	void ZIPOfRecord1601() {
		assertEquals("33404", customers.get(1600).getZIP());
	}

	@Test
	@DisplayName("Record 1601: Phone is 561-844-6676")
	void PhoneOfRecord1601() {
		assertEquals("561-844-6676", customers.get(1600).getPhone());
	}

	@Test
	@DisplayName("Record 1601: Fax is 561-844-1152")
	void FaxOfRecord1601() {
		assertEquals("561-844-1152", customers.get(1600).getFax());
	}

	@Test
	@DisplayName("Record 1601: Email is jordon@pacella.com")
	void EmailOfRecord1601() {
		assertEquals("jordon@pacella.com", customers.get(1600).getEmail());
	}

	@Test
	@DisplayName("Record 1601: Web is http://www.jordonpacella.com")
	void WebOfRecord1601() {
		assertEquals("http://www.jordonpacella.com", customers.get(1600).getWeb());
	}
}
