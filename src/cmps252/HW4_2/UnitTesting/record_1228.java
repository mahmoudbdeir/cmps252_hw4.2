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

@Tag("10")
class Record_1228 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1228: FirstName is Ervin")
	void FirstNameOfRecord1228() {
		assertEquals("Ervin", customers.get(1227).getFirstName());
	}

	@Test
	@DisplayName("Record 1228: LastName is Debaca")
	void LastNameOfRecord1228() {
		assertEquals("Debaca", customers.get(1227).getLastName());
	}

	@Test
	@DisplayName("Record 1228: Company is Pandarama Schools")
	void CompanyOfRecord1228() {
		assertEquals("Pandarama Schools", customers.get(1227).getCompany());
	}

	@Test
	@DisplayName("Record 1228: Address is 1025 Easter Lily Ln")
	void AddressOfRecord1228() {
		assertEquals("1025 Easter Lily Ln", customers.get(1227).getAddress());
	}

	@Test
	@DisplayName("Record 1228: City is Vero Beach")
	void CityOfRecord1228() {
		assertEquals("Vero Beach", customers.get(1227).getCity());
	}

	@Test
	@DisplayName("Record 1228: County is Indian River")
	void CountyOfRecord1228() {
		assertEquals("Indian River", customers.get(1227).getCounty());
	}

	@Test
	@DisplayName("Record 1228: State is FL")
	void StateOfRecord1228() {
		assertEquals("FL", customers.get(1227).getState());
	}

	@Test
	@DisplayName("Record 1228: ZIP is 32963")
	void ZIPOfRecord1228() {
		assertEquals("32963", customers.get(1227).getZIP());
	}

	@Test
	@DisplayName("Record 1228: Phone is 772-234-7089")
	void PhoneOfRecord1228() {
		assertEquals("772-234-7089", customers.get(1227).getPhone());
	}

	@Test
	@DisplayName("Record 1228: Fax is 772-234-4485")
	void FaxOfRecord1228() {
		assertEquals("772-234-4485", customers.get(1227).getFax());
	}

	@Test
	@DisplayName("Record 1228: Email is ervin@debaca.com")
	void EmailOfRecord1228() {
		assertEquals("ervin@debaca.com", customers.get(1227).getEmail());
	}

	@Test
	@DisplayName("Record 1228: Web is http://www.ervindebaca.com")
	void WebOfRecord1228() {
		assertEquals("http://www.ervindebaca.com", customers.get(1227).getWeb());
	}
}
