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

@Tag("20")
class Record_4749 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4749: FirstName is Myles")
	void FirstNameOfRecord4749() {
		assertEquals("Myles", customers.get(4748).getFirstName());
	}

	@Test
	@DisplayName("Record 4749: LastName is Murguia")
	void LastNameOfRecord4749() {
		assertEquals("Murguia", customers.get(4748).getLastName());
	}

	@Test
	@DisplayName("Record 4749: Company is City Savings Bank Fsb")
	void CompanyOfRecord4749() {
		assertEquals("City Savings Bank Fsb", customers.get(4748).getCompany());
	}

	@Test
	@DisplayName("Record 4749: Address is 1086 Rainberry Ct")
	void AddressOfRecord4749() {
		assertEquals("1086 Rainberry Ct", customers.get(4748).getAddress());
	}

	@Test
	@DisplayName("Record 4749: City is Neenah")
	void CityOfRecord4749() {
		assertEquals("Neenah", customers.get(4748).getCity());
	}

	@Test
	@DisplayName("Record 4749: County is Winnebago")
	void CountyOfRecord4749() {
		assertEquals("Winnebago", customers.get(4748).getCounty());
	}

	@Test
	@DisplayName("Record 4749: State is WI")
	void StateOfRecord4749() {
		assertEquals("WI", customers.get(4748).getState());
	}

	@Test
	@DisplayName("Record 4749: ZIP is 54956")
	void ZIPOfRecord4749() {
		assertEquals("54956", customers.get(4748).getZIP());
	}

	@Test
	@DisplayName("Record 4749: Phone is 920-729-7998")
	void PhoneOfRecord4749() {
		assertEquals("920-729-7998", customers.get(4748).getPhone());
	}

	@Test
	@DisplayName("Record 4749: Fax is 920-729-3112")
	void FaxOfRecord4749() {
		assertEquals("920-729-3112", customers.get(4748).getFax());
	}

	@Test
	@DisplayName("Record 4749: Email is myles@murguia.com")
	void EmailOfRecord4749() {
		assertEquals("myles@murguia.com", customers.get(4748).getEmail());
	}

	@Test
	@DisplayName("Record 4749: Web is http://www.mylesmurguia.com")
	void WebOfRecord4749() {
		assertEquals("http://www.mylesmurguia.com", customers.get(4748).getWeb());
	}
}
