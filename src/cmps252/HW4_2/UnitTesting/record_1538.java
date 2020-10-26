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

@Tag("48")
class Record_1538 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1538: FirstName is Chandra")
	void FirstNameOfRecord1538() {
		assertEquals("Chandra", customers.get(1537).getFirstName());
	}

	@Test
	@DisplayName("Record 1538: LastName is Dinneen")
	void LastNameOfRecord1538() {
		assertEquals("Dinneen", customers.get(1537).getLastName());
	}

	@Test
	@DisplayName("Record 1538: Company is Techno Coatings")
	void CompanyOfRecord1538() {
		assertEquals("Techno Coatings", customers.get(1537).getCompany());
	}

	@Test
	@DisplayName("Record 1538: Address is 36 E 4th St")
	void AddressOfRecord1538() {
		assertEquals("36 E 4th St", customers.get(1537).getAddress());
	}

	@Test
	@DisplayName("Record 1538: City is Cincinnati")
	void CityOfRecord1538() {
		assertEquals("Cincinnati", customers.get(1537).getCity());
	}

	@Test
	@DisplayName("Record 1538: County is Hamilton")
	void CountyOfRecord1538() {
		assertEquals("Hamilton", customers.get(1537).getCounty());
	}

	@Test
	@DisplayName("Record 1538: State is OH")
	void StateOfRecord1538() {
		assertEquals("OH", customers.get(1537).getState());
	}

	@Test
	@DisplayName("Record 1538: ZIP is 45202")
	void ZIPOfRecord1538() {
		assertEquals("45202", customers.get(1537).getZIP());
	}

	@Test
	@DisplayName("Record 1538: Phone is 513-421-8272")
	void PhoneOfRecord1538() {
		assertEquals("513-421-8272", customers.get(1537).getPhone());
	}

	@Test
	@DisplayName("Record 1538: Fax is 513-421-1285")
	void FaxOfRecord1538() {
		assertEquals("513-421-1285", customers.get(1537).getFax());
	}

	@Test
	@DisplayName("Record 1538: Email is chandra@dinneen.com")
	void EmailOfRecord1538() {
		assertEquals("chandra@dinneen.com", customers.get(1537).getEmail());
	}

	@Test
	@DisplayName("Record 1538: Web is http://www.chandradinneen.com")
	void WebOfRecord1538() {
		assertEquals("http://www.chandradinneen.com", customers.get(1537).getWeb());
	}
}
