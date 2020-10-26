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

@Tag("11")
class Record_1059 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1059: FirstName is Brittany")
	void FirstNameOfRecord1059() {
		assertEquals("Brittany", customers.get(1058).getFirstName());
	}

	@Test
	@DisplayName("Record 1059: LastName is Alles")
	void LastNameOfRecord1059() {
		assertEquals("Alles", customers.get(1058).getLastName());
	}

	@Test
	@DisplayName("Record 1059: Company is Rpi Reed Presentations Inc")
	void CompanyOfRecord1059() {
		assertEquals("Rpi Reed Presentations Inc", customers.get(1058).getCompany());
	}

	@Test
	@DisplayName("Record 1059: Address is 66 E 3335th S")
	void AddressOfRecord1059() {
		assertEquals("66 E 3335th S", customers.get(1058).getAddress());
	}

	@Test
	@DisplayName("Record 1059: City is Salt Lake City")
	void CityOfRecord1059() {
		assertEquals("Salt Lake City", customers.get(1058).getCity());
	}

	@Test
	@DisplayName("Record 1059: County is Salt Lake")
	void CountyOfRecord1059() {
		assertEquals("Salt Lake", customers.get(1058).getCounty());
	}

	@Test
	@DisplayName("Record 1059: State is UT")
	void StateOfRecord1059() {
		assertEquals("UT", customers.get(1058).getState());
	}

	@Test
	@DisplayName("Record 1059: ZIP is 84115")
	void ZIPOfRecord1059() {
		assertEquals("84115", customers.get(1058).getZIP());
	}

	@Test
	@DisplayName("Record 1059: Phone is 801-484-1896")
	void PhoneOfRecord1059() {
		assertEquals("801-484-1896", customers.get(1058).getPhone());
	}

	@Test
	@DisplayName("Record 1059: Fax is 801-484-9979")
	void FaxOfRecord1059() {
		assertEquals("801-484-9979", customers.get(1058).getFax());
	}

	@Test
	@DisplayName("Record 1059: Email is brittany@alles.com")
	void EmailOfRecord1059() {
		assertEquals("brittany@alles.com", customers.get(1058).getEmail());
	}

	@Test
	@DisplayName("Record 1059: Web is http://www.brittanyalles.com")
	void WebOfRecord1059() {
		assertEquals("http://www.brittanyalles.com", customers.get(1058).getWeb());
	}
}
