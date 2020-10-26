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

@Tag("1")
class Record_4059 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4059: FirstName is Cleo")
	void FirstNameOfRecord4059() {
		assertEquals("Cleo", customers.get(4058).getFirstName());
	}

	@Test
	@DisplayName("Record 4059: LastName is Wala")
	void LastNameOfRecord4059() {
		assertEquals("Wala", customers.get(4058).getLastName());
	}

	@Test
	@DisplayName("Record 4059: Company is Tennis Factory")
	void CompanyOfRecord4059() {
		assertEquals("Tennis Factory", customers.get(4058).getCompany());
	}

	@Test
	@DisplayName("Record 4059: Address is 2414 Kohler Memorial Dr")
	void AddressOfRecord4059() {
		assertEquals("2414 Kohler Memorial Dr", customers.get(4058).getAddress());
	}

	@Test
	@DisplayName("Record 4059: City is Sheboygan")
	void CityOfRecord4059() {
		assertEquals("Sheboygan", customers.get(4058).getCity());
	}

	@Test
	@DisplayName("Record 4059: County is Sheboygan")
	void CountyOfRecord4059() {
		assertEquals("Sheboygan", customers.get(4058).getCounty());
	}

	@Test
	@DisplayName("Record 4059: State is WI")
	void StateOfRecord4059() {
		assertEquals("WI", customers.get(4058).getState());
	}

	@Test
	@DisplayName("Record 4059: ZIP is 53081")
	void ZIPOfRecord4059() {
		assertEquals("53081", customers.get(4058).getZIP());
	}

	@Test
	@DisplayName("Record 4059: Phone is 920-459-6577")
	void PhoneOfRecord4059() {
		assertEquals("920-459-6577", customers.get(4058).getPhone());
	}

	@Test
	@DisplayName("Record 4059: Fax is 920-459-5891")
	void FaxOfRecord4059() {
		assertEquals("920-459-5891", customers.get(4058).getFax());
	}

	@Test
	@DisplayName("Record 4059: Email is cleo@wala.com")
	void EmailOfRecord4059() {
		assertEquals("cleo@wala.com", customers.get(4058).getEmail());
	}

	@Test
	@DisplayName("Record 4059: Web is http://www.cleowala.com")
	void WebOfRecord4059() {
		assertEquals("http://www.cleowala.com", customers.get(4058).getWeb());
	}
}
