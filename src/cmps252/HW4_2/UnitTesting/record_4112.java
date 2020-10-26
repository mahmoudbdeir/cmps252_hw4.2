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

@Tag("25")
class Record_4112 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4112: FirstName is Lauretta")
	void FirstNameOfRecord4112() {
		assertEquals("Lauretta", customers.get(4111).getFirstName());
	}

	@Test
	@DisplayName("Record 4112: LastName is Kuza")
	void LastNameOfRecord4112() {
		assertEquals("Kuza", customers.get(4111).getLastName());
	}

	@Test
	@DisplayName("Record 4112: Company is Lemire, Robert E Jr")
	void CompanyOfRecord4112() {
		assertEquals("Lemire, Robert E Jr", customers.get(4111).getCompany());
	}

	@Test
	@DisplayName("Record 4112: Address is 12053 Nebel St")
	void AddressOfRecord4112() {
		assertEquals("12053 Nebel St", customers.get(4111).getAddress());
	}

	@Test
	@DisplayName("Record 4112: City is Rockville")
	void CityOfRecord4112() {
		assertEquals("Rockville", customers.get(4111).getCity());
	}

	@Test
	@DisplayName("Record 4112: County is Montgomery")
	void CountyOfRecord4112() {
		assertEquals("Montgomery", customers.get(4111).getCounty());
	}

	@Test
	@DisplayName("Record 4112: State is MD")
	void StateOfRecord4112() {
		assertEquals("MD", customers.get(4111).getState());
	}

	@Test
	@DisplayName("Record 4112: ZIP is 20852")
	void ZIPOfRecord4112() {
		assertEquals("20852", customers.get(4111).getZIP());
	}

	@Test
	@DisplayName("Record 4112: Phone is 301-468-6680")
	void PhoneOfRecord4112() {
		assertEquals("301-468-6680", customers.get(4111).getPhone());
	}

	@Test
	@DisplayName("Record 4112: Fax is 301-468-3592")
	void FaxOfRecord4112() {
		assertEquals("301-468-3592", customers.get(4111).getFax());
	}

	@Test
	@DisplayName("Record 4112: Email is lauretta@kuza.com")
	void EmailOfRecord4112() {
		assertEquals("lauretta@kuza.com", customers.get(4111).getEmail());
	}

	@Test
	@DisplayName("Record 4112: Web is http://www.laurettakuza.com")
	void WebOfRecord4112() {
		assertEquals("http://www.laurettakuza.com", customers.get(4111).getWeb());
	}
}
