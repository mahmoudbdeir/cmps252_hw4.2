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

@Tag("32")
class Record_1913 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1913: FirstName is Ernie")
	void FirstNameOfRecord1913() {
		assertEquals("Ernie", customers.get(1912).getFirstName());
	}

	@Test
	@DisplayName("Record 1913: LastName is Ruhlin")
	void LastNameOfRecord1913() {
		assertEquals("Ruhlin", customers.get(1912).getLastName());
	}

	@Test
	@DisplayName("Record 1913: Company is Alexander Rsrch & Commctns Inc")
	void CompanyOfRecord1913() {
		assertEquals("Alexander Rsrch & Commctns Inc", customers.get(1912).getCompany());
	}

	@Test
	@DisplayName("Record 1913: Address is 1116 Marshall Ave")
	void AddressOfRecord1913() {
		assertEquals("1116 Marshall Ave", customers.get(1912).getAddress());
	}

	@Test
	@DisplayName("Record 1913: City is Lancaster")
	void CityOfRecord1913() {
		assertEquals("Lancaster", customers.get(1912).getCity());
	}

	@Test
	@DisplayName("Record 1913: County is Lancaster")
	void CountyOfRecord1913() {
		assertEquals("Lancaster", customers.get(1912).getCounty());
	}

	@Test
	@DisplayName("Record 1913: State is PA")
	void StateOfRecord1913() {
		assertEquals("PA", customers.get(1912).getState());
	}

	@Test
	@DisplayName("Record 1913: ZIP is 17601")
	void ZIPOfRecord1913() {
		assertEquals("17601", customers.get(1912).getZIP());
	}

	@Test
	@DisplayName("Record 1913: Phone is 717-392-0262")
	void PhoneOfRecord1913() {
		assertEquals("717-392-0262", customers.get(1912).getPhone());
	}

	@Test
	@DisplayName("Record 1913: Fax is 717-392-6091")
	void FaxOfRecord1913() {
		assertEquals("717-392-6091", customers.get(1912).getFax());
	}

	@Test
	@DisplayName("Record 1913: Email is ernie@ruhlin.com")
	void EmailOfRecord1913() {
		assertEquals("ernie@ruhlin.com", customers.get(1912).getEmail());
	}

	@Test
	@DisplayName("Record 1913: Web is http://www.ernieruhlin.com")
	void WebOfRecord1913() {
		assertEquals("http://www.ernieruhlin.com", customers.get(1912).getWeb());
	}
}
