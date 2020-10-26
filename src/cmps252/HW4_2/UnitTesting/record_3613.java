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

@Tag("1")
class Record_3613 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3613: FirstName is Jeromy")
	void FirstNameOfRecord3613() {
		assertEquals("Jeromy", customers.get(3612).getFirstName());
	}

	@Test
	@DisplayName("Record 3613: LastName is Mccullars")
	void LastNameOfRecord3613() {
		assertEquals("Mccullars", customers.get(3612).getLastName());
	}

	@Test
	@DisplayName("Record 3613: Company is Fleming Sheet Metal Shop")
	void CompanyOfRecord3613() {
		assertEquals("Fleming Sheet Metal Shop", customers.get(3612).getCompany());
	}

	@Test
	@DisplayName("Record 3613: Address is 200 W Douglas Ave")
	void AddressOfRecord3613() {
		assertEquals("200 W Douglas Ave", customers.get(3612).getAddress());
	}

	@Test
	@DisplayName("Record 3613: City is Wichita")
	void CityOfRecord3613() {
		assertEquals("Wichita", customers.get(3612).getCity());
	}

	@Test
	@DisplayName("Record 3613: County is Sedgwick")
	void CountyOfRecord3613() {
		assertEquals("Sedgwick", customers.get(3612).getCounty());
	}

	@Test
	@DisplayName("Record 3613: State is KS")
	void StateOfRecord3613() {
		assertEquals("KS", customers.get(3612).getState());
	}

	@Test
	@DisplayName("Record 3613: ZIP is 67202")
	void ZIPOfRecord3613() {
		assertEquals("67202", customers.get(3612).getZIP());
	}

	@Test
	@DisplayName("Record 3613: Phone is 316-262-9460")
	void PhoneOfRecord3613() {
		assertEquals("316-262-9460", customers.get(3612).getPhone());
	}

	@Test
	@DisplayName("Record 3613: Fax is 316-262-2002")
	void FaxOfRecord3613() {
		assertEquals("316-262-2002", customers.get(3612).getFax());
	}

	@Test
	@DisplayName("Record 3613: Email is jeromy@mccullars.com")
	void EmailOfRecord3613() {
		assertEquals("jeromy@mccullars.com", customers.get(3612).getEmail());
	}

	@Test
	@DisplayName("Record 3613: Web is http://www.jeromymccullars.com")
	void WebOfRecord3613() {
		assertEquals("http://www.jeromymccullars.com", customers.get(3612).getWeb());
	}
}
