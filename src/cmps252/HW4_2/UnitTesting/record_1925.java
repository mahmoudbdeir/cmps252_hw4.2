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

@Tag("18")
class Record_1925 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1925: FirstName is Rubin")
	void FirstNameOfRecord1925() {
		assertEquals("Rubin", customers.get(1924).getFirstName());
	}

	@Test
	@DisplayName("Record 1925: LastName is Gilreath")
	void LastNameOfRecord1925() {
		assertEquals("Gilreath", customers.get(1924).getLastName());
	}

	@Test
	@DisplayName("Record 1925: Company is Haldor Topsoe Inc")
	void CompanyOfRecord1925() {
		assertEquals("Haldor Topsoe Inc", customers.get(1924).getCompany());
	}

	@Test
	@DisplayName("Record 1925: Address is 1159 Us Highway 22")
	void AddressOfRecord1925() {
		assertEquals("1159 Us Highway 22", customers.get(1924).getAddress());
	}

	@Test
	@DisplayName("Record 1925: City is Mountainside")
	void CityOfRecord1925() {
		assertEquals("Mountainside", customers.get(1924).getCity());
	}

	@Test
	@DisplayName("Record 1925: County is Union")
	void CountyOfRecord1925() {
		assertEquals("Union", customers.get(1924).getCounty());
	}

	@Test
	@DisplayName("Record 1925: State is NJ")
	void StateOfRecord1925() {
		assertEquals("NJ", customers.get(1924).getState());
	}

	@Test
	@DisplayName("Record 1925: ZIP is 7092")
	void ZIPOfRecord1925() {
		assertEquals("7092", customers.get(1924).getZIP());
	}

	@Test
	@DisplayName("Record 1925: Phone is 908-232-1171")
	void PhoneOfRecord1925() {
		assertEquals("908-232-1171", customers.get(1924).getPhone());
	}

	@Test
	@DisplayName("Record 1925: Fax is 908-232-4827")
	void FaxOfRecord1925() {
		assertEquals("908-232-4827", customers.get(1924).getFax());
	}

	@Test
	@DisplayName("Record 1925: Email is rubin@gilreath.com")
	void EmailOfRecord1925() {
		assertEquals("rubin@gilreath.com", customers.get(1924).getEmail());
	}

	@Test
	@DisplayName("Record 1925: Web is http://www.rubingilreath.com")
	void WebOfRecord1925() {
		assertEquals("http://www.rubingilreath.com", customers.get(1924).getWeb());
	}
}
