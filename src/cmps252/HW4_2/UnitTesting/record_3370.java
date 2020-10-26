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
class Record_3370 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3370: FirstName is Arnulfo")
	void FirstNameOfRecord3370() {
		assertEquals("Arnulfo", customers.get(3369).getFirstName());
	}

	@Test
	@DisplayName("Record 3370: LastName is Liedtke")
	void LastNameOfRecord3370() {
		assertEquals("Liedtke", customers.get(3369).getLastName());
	}

	@Test
	@DisplayName("Record 3370: Company is Travelodge Motel Of York")
	void CompanyOfRecord3370() {
		assertEquals("Travelodge Motel Of York", customers.get(3369).getCompany());
	}

	@Test
	@DisplayName("Record 3370: Address is 4433 N 19th Ave")
	void AddressOfRecord3370() {
		assertEquals("4433 N 19th Ave", customers.get(3369).getAddress());
	}

	@Test
	@DisplayName("Record 3370: City is Phoenix")
	void CityOfRecord3370() {
		assertEquals("Phoenix", customers.get(3369).getCity());
	}

	@Test
	@DisplayName("Record 3370: County is Maricopa")
	void CountyOfRecord3370() {
		assertEquals("Maricopa", customers.get(3369).getCounty());
	}

	@Test
	@DisplayName("Record 3370: State is AZ")
	void StateOfRecord3370() {
		assertEquals("AZ", customers.get(3369).getState());
	}

	@Test
	@DisplayName("Record 3370: ZIP is 85015")
	void ZIPOfRecord3370() {
		assertEquals("85015", customers.get(3369).getZIP());
	}

	@Test
	@DisplayName("Record 3370: Phone is 602-266-7434")
	void PhoneOfRecord3370() {
		assertEquals("602-266-7434", customers.get(3369).getPhone());
	}

	@Test
	@DisplayName("Record 3370: Fax is 602-266-6551")
	void FaxOfRecord3370() {
		assertEquals("602-266-6551", customers.get(3369).getFax());
	}

	@Test
	@DisplayName("Record 3370: Email is arnulfo@liedtke.com")
	void EmailOfRecord3370() {
		assertEquals("arnulfo@liedtke.com", customers.get(3369).getEmail());
	}

	@Test
	@DisplayName("Record 3370: Web is http://www.arnulfoliedtke.com")
	void WebOfRecord3370() {
		assertEquals("http://www.arnulfoliedtke.com", customers.get(3369).getWeb());
	}
}
