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

@Tag("28")
class Record_3190 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3190: FirstName is Arlie")
	void FirstNameOfRecord3190() {
		assertEquals("Arlie", customers.get(3189).getFirstName());
	}

	@Test
	@DisplayName("Record 3190: LastName is Karoly")
	void LastNameOfRecord3190() {
		assertEquals("Karoly", customers.get(3189).getLastName());
	}

	@Test
	@DisplayName("Record 3190: Company is Wells, Ronald D Esq")
	void CompanyOfRecord3190() {
		assertEquals("Wells, Ronald D Esq", customers.get(3189).getCompany());
	}

	@Test
	@DisplayName("Record 3190: Address is 912 E Javelina Ave  #-1")
	void AddressOfRecord3190() {
		assertEquals("912 E Javelina Ave  #-1", customers.get(3189).getAddress());
	}

	@Test
	@DisplayName("Record 3190: City is Mesa")
	void CityOfRecord3190() {
		assertEquals("Mesa", customers.get(3189).getCity());
	}

	@Test
	@DisplayName("Record 3190: County is Maricopa")
	void CountyOfRecord3190() {
		assertEquals("Maricopa", customers.get(3189).getCounty());
	}

	@Test
	@DisplayName("Record 3190: State is AZ")
	void StateOfRecord3190() {
		assertEquals("AZ", customers.get(3189).getState());
	}

	@Test
	@DisplayName("Record 3190: ZIP is 85204")
	void ZIPOfRecord3190() {
		assertEquals("85204", customers.get(3189).getZIP());
	}

	@Test
	@DisplayName("Record 3190: Phone is 480-892-6295")
	void PhoneOfRecord3190() {
		assertEquals("480-892-6295", customers.get(3189).getPhone());
	}

	@Test
	@DisplayName("Record 3190: Fax is 480-892-3607")
	void FaxOfRecord3190() {
		assertEquals("480-892-3607", customers.get(3189).getFax());
	}

	@Test
	@DisplayName("Record 3190: Email is arlie@karoly.com")
	void EmailOfRecord3190() {
		assertEquals("arlie@karoly.com", customers.get(3189).getEmail());
	}

	@Test
	@DisplayName("Record 3190: Web is http://www.arliekaroly.com")
	void WebOfRecord3190() {
		assertEquals("http://www.arliekaroly.com", customers.get(3189).getWeb());
	}
}
