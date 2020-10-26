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

@Tag("35")
class Record_1321 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1321: FirstName is Kelsey")
	void FirstNameOfRecord1321() {
		assertEquals("Kelsey", customers.get(1320).getFirstName());
	}

	@Test
	@DisplayName("Record 1321: LastName is Fanner")
	void LastNameOfRecord1321() {
		assertEquals("Fanner", customers.get(1320).getLastName());
	}

	@Test
	@DisplayName("Record 1321: Company is Delley, Ralph B Md")
	void CompanyOfRecord1321() {
		assertEquals("Delley, Ralph B Md", customers.get(1320).getCompany());
	}

	@Test
	@DisplayName("Record 1321: Address is Box #-2616")
	void AddressOfRecord1321() {
		assertEquals("Box #-2616", customers.get(1320).getAddress());
	}

	@Test
	@DisplayName("Record 1321: City is Truckee")
	void CityOfRecord1321() {
		assertEquals("Truckee", customers.get(1320).getCity());
	}

	@Test
	@DisplayName("Record 1321: County is Nevada")
	void CountyOfRecord1321() {
		assertEquals("Nevada", customers.get(1320).getCounty());
	}

	@Test
	@DisplayName("Record 1321: State is CA")
	void StateOfRecord1321() {
		assertEquals("CA", customers.get(1320).getState());
	}

	@Test
	@DisplayName("Record 1321: ZIP is 96160")
	void ZIPOfRecord1321() {
		assertEquals("96160", customers.get(1320).getZIP());
	}

	@Test
	@DisplayName("Record 1321: Phone is 530-587-8579")
	void PhoneOfRecord1321() {
		assertEquals("530-587-8579", customers.get(1320).getPhone());
	}

	@Test
	@DisplayName("Record 1321: Fax is 530-587-9006")
	void FaxOfRecord1321() {
		assertEquals("530-587-9006", customers.get(1320).getFax());
	}

	@Test
	@DisplayName("Record 1321: Email is kelsey@fanner.com")
	void EmailOfRecord1321() {
		assertEquals("kelsey@fanner.com", customers.get(1320).getEmail());
	}

	@Test
	@DisplayName("Record 1321: Web is http://www.kelseyfanner.com")
	void WebOfRecord1321() {
		assertEquals("http://www.kelseyfanner.com", customers.get(1320).getWeb());
	}
}
