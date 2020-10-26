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

@Tag("16")
class Record_1562 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1562: FirstName is Bridget")
	void FirstNameOfRecord1562() {
		assertEquals("Bridget", customers.get(1561).getFirstName());
	}

	@Test
	@DisplayName("Record 1562: LastName is Dichiara")
	void LastNameOfRecord1562() {
		assertEquals("Dichiara", customers.get(1561).getLastName());
	}

	@Test
	@DisplayName("Record 1562: Company is Towe, Mark H Cpa")
	void CompanyOfRecord1562() {
		assertEquals("Towe, Mark H Cpa", customers.get(1561).getCompany());
	}

	@Test
	@DisplayName("Record 1562: Address is 12175 Folsom Blvd")
	void AddressOfRecord1562() {
		assertEquals("12175 Folsom Blvd", customers.get(1561).getAddress());
	}

	@Test
	@DisplayName("Record 1562: City is Rancho Cordova")
	void CityOfRecord1562() {
		assertEquals("Rancho Cordova", customers.get(1561).getCity());
	}

	@Test
	@DisplayName("Record 1562: County is Sacramento")
	void CountyOfRecord1562() {
		assertEquals("Sacramento", customers.get(1561).getCounty());
	}

	@Test
	@DisplayName("Record 1562: State is CA")
	void StateOfRecord1562() {
		assertEquals("CA", customers.get(1561).getState());
	}

	@Test
	@DisplayName("Record 1562: ZIP is 95742")
	void ZIPOfRecord1562() {
		assertEquals("95742", customers.get(1561).getZIP());
	}

	@Test
	@DisplayName("Record 1562: Phone is 916-985-9847")
	void PhoneOfRecord1562() {
		assertEquals("916-985-9847", customers.get(1561).getPhone());
	}

	@Test
	@DisplayName("Record 1562: Fax is 916-985-1897")
	void FaxOfRecord1562() {
		assertEquals("916-985-1897", customers.get(1561).getFax());
	}

	@Test
	@DisplayName("Record 1562: Email is bridget@dichiara.com")
	void EmailOfRecord1562() {
		assertEquals("bridget@dichiara.com", customers.get(1561).getEmail());
	}

	@Test
	@DisplayName("Record 1562: Web is http://www.bridgetdichiara.com")
	void WebOfRecord1562() {
		assertEquals("http://www.bridgetdichiara.com", customers.get(1561).getWeb());
	}
}
