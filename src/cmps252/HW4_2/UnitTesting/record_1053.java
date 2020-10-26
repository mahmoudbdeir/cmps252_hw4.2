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

@Tag("15")
class Record_1053 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1053: FirstName is Buck")
	void FirstNameOfRecord1053() {
		assertEquals("Buck", customers.get(1052).getFirstName());
	}

	@Test
	@DisplayName("Record 1053: LastName is Turbide")
	void LastNameOfRecord1053() {
		assertEquals("Turbide", customers.get(1052).getLastName());
	}

	@Test
	@DisplayName("Record 1053: Company is Giles, H M Jr")
	void CompanyOfRecord1053() {
		assertEquals("Giles, H M Jr", customers.get(1052).getCompany());
	}

	@Test
	@DisplayName("Record 1053: Address is 1088 Bishop St  #-804")
	void AddressOfRecord1053() {
		assertEquals("1088 Bishop St  #-804", customers.get(1052).getAddress());
	}

	@Test
	@DisplayName("Record 1053: City is Honolulu")
	void CityOfRecord1053() {
		assertEquals("Honolulu", customers.get(1052).getCity());
	}

	@Test
	@DisplayName("Record 1053: County is Honolulu")
	void CountyOfRecord1053() {
		assertEquals("Honolulu", customers.get(1052).getCounty());
	}

	@Test
	@DisplayName("Record 1053: State is HI")
	void StateOfRecord1053() {
		assertEquals("HI", customers.get(1052).getState());
	}

	@Test
	@DisplayName("Record 1053: ZIP is 96813")
	void ZIPOfRecord1053() {
		assertEquals("96813", customers.get(1052).getZIP());
	}

	@Test
	@DisplayName("Record 1053: Phone is 808-531-8447")
	void PhoneOfRecord1053() {
		assertEquals("808-531-8447", customers.get(1052).getPhone());
	}

	@Test
	@DisplayName("Record 1053: Fax is 808-531-0533")
	void FaxOfRecord1053() {
		assertEquals("808-531-0533", customers.get(1052).getFax());
	}

	@Test
	@DisplayName("Record 1053: Email is buck@turbide.com")
	void EmailOfRecord1053() {
		assertEquals("buck@turbide.com", customers.get(1052).getEmail());
	}

	@Test
	@DisplayName("Record 1053: Web is http://www.buckturbide.com")
	void WebOfRecord1053() {
		assertEquals("http://www.buckturbide.com", customers.get(1052).getWeb());
	}
}
