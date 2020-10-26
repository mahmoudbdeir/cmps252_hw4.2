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
class Record_2396 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2396: FirstName is Gino")
	void FirstNameOfRecord2396() {
		assertEquals("Gino", customers.get(2395).getFirstName());
	}

	@Test
	@DisplayName("Record 2396: LastName is Yawn")
	void LastNameOfRecord2396() {
		assertEquals("Yawn", customers.get(2395).getLastName());
	}

	@Test
	@DisplayName("Record 2396: Company is Rebe, Sal Esq")
	void CompanyOfRecord2396() {
		assertEquals("Rebe, Sal Esq", customers.get(2395).getCompany());
	}

	@Test
	@DisplayName("Record 2396: Address is 1519 S La Cienega Blvd")
	void AddressOfRecord2396() {
		assertEquals("1519 S La Cienega Blvd", customers.get(2395).getAddress());
	}

	@Test
	@DisplayName("Record 2396: City is Los Angeles")
	void CityOfRecord2396() {
		assertEquals("Los Angeles", customers.get(2395).getCity());
	}

	@Test
	@DisplayName("Record 2396: County is Los Angeles")
	void CountyOfRecord2396() {
		assertEquals("Los Angeles", customers.get(2395).getCounty());
	}

	@Test
	@DisplayName("Record 2396: State is CA")
	void StateOfRecord2396() {
		assertEquals("CA", customers.get(2395).getState());
	}

	@Test
	@DisplayName("Record 2396: ZIP is 90035")
	void ZIPOfRecord2396() {
		assertEquals("90035", customers.get(2395).getZIP());
	}

	@Test
	@DisplayName("Record 2396: Phone is 310-657-4898")
	void PhoneOfRecord2396() {
		assertEquals("310-657-4898", customers.get(2395).getPhone());
	}

	@Test
	@DisplayName("Record 2396: Fax is 310-657-1779")
	void FaxOfRecord2396() {
		assertEquals("310-657-1779", customers.get(2395).getFax());
	}

	@Test
	@DisplayName("Record 2396: Email is gino@yawn.com")
	void EmailOfRecord2396() {
		assertEquals("gino@yawn.com", customers.get(2395).getEmail());
	}

	@Test
	@DisplayName("Record 2396: Web is http://www.ginoyawn.com")
	void WebOfRecord2396() {
		assertEquals("http://www.ginoyawn.com", customers.get(2395).getWeb());
	}
}
