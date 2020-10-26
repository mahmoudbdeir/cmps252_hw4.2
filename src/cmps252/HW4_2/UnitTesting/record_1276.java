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

@Tag("2")
class Record_1276 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1276: FirstName is Chandra")
	void FirstNameOfRecord1276() {
		assertEquals("Chandra", customers.get(1275).getFirstName());
	}

	@Test
	@DisplayName("Record 1276: LastName is Rennaker")
	void LastNameOfRecord1276() {
		assertEquals("Rennaker", customers.get(1275).getLastName());
	}

	@Test
	@DisplayName("Record 1276: Company is Raimondi Associates Pa")
	void CompanyOfRecord1276() {
		assertEquals("Raimondi Associates Pa", customers.get(1275).getCompany());
	}

	@Test
	@DisplayName("Record 1276: Address is 1301 Prince Rodgers Ave")
	void AddressOfRecord1276() {
		assertEquals("1301 Prince Rodgers Ave", customers.get(1275).getAddress());
	}

	@Test
	@DisplayName("Record 1276: City is Bridgewater")
	void CityOfRecord1276() {
		assertEquals("Bridgewater", customers.get(1275).getCity());
	}

	@Test
	@DisplayName("Record 1276: County is Somerset")
	void CountyOfRecord1276() {
		assertEquals("Somerset", customers.get(1275).getCounty());
	}

	@Test
	@DisplayName("Record 1276: State is NJ")
	void StateOfRecord1276() {
		assertEquals("NJ", customers.get(1275).getState());
	}

	@Test
	@DisplayName("Record 1276: ZIP is 8807")
	void ZIPOfRecord1276() {
		assertEquals("8807", customers.get(1275).getZIP());
	}

	@Test
	@DisplayName("Record 1276: Phone is 908-231-8603")
	void PhoneOfRecord1276() {
		assertEquals("908-231-8603", customers.get(1275).getPhone());
	}

	@Test
	@DisplayName("Record 1276: Fax is 908-231-1805")
	void FaxOfRecord1276() {
		assertEquals("908-231-1805", customers.get(1275).getFax());
	}

	@Test
	@DisplayName("Record 1276: Email is chandra@rennaker.com")
	void EmailOfRecord1276() {
		assertEquals("chandra@rennaker.com", customers.get(1275).getEmail());
	}

	@Test
	@DisplayName("Record 1276: Web is http://www.chandrarennaker.com")
	void WebOfRecord1276() {
		assertEquals("http://www.chandrarennaker.com", customers.get(1275).getWeb());
	}
}
