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
class Record_317 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 317: FirstName is Amanda")
	void FirstNameOfRecord317() {
		assertEquals("Amanda", customers.get(316).getFirstName());
	}

	@Test
	@DisplayName("Record 317: LastName is Wanvig")
	void LastNameOfRecord317() {
		assertEquals("Wanvig", customers.get(316).getLastName());
	}

	@Test
	@DisplayName("Record 317: Company is T & T Anodizing")
	void CompanyOfRecord317() {
		assertEquals("T & T Anodizing", customers.get(316).getCompany());
	}

	@Test
	@DisplayName("Record 317: Address is 65 Main St")
	void AddressOfRecord317() {
		assertEquals("65 Main St", customers.get(316).getAddress());
	}

	@Test
	@DisplayName("Record 317: City is High Bridge")
	void CityOfRecord317() {
		assertEquals("High Bridge", customers.get(316).getCity());
	}

	@Test
	@DisplayName("Record 317: County is Hunterdon")
	void CountyOfRecord317() {
		assertEquals("Hunterdon", customers.get(316).getCounty());
	}

	@Test
	@DisplayName("Record 317: State is NJ")
	void StateOfRecord317() {
		assertEquals("NJ", customers.get(316).getState());
	}

	@Test
	@DisplayName("Record 317: ZIP is 8829")
	void ZIPOfRecord317() {
		assertEquals("8829", customers.get(316).getZIP());
	}

	@Test
	@DisplayName("Record 317: Phone is 908-638-9769")
	void PhoneOfRecord317() {
		assertEquals("908-638-9769", customers.get(316).getPhone());
	}

	@Test
	@DisplayName("Record 317: Fax is 908-638-0902")
	void FaxOfRecord317() {
		assertEquals("908-638-0902", customers.get(316).getFax());
	}

	@Test
	@DisplayName("Record 317: Email is amanda@wanvig.com")
	void EmailOfRecord317() {
		assertEquals("amanda@wanvig.com", customers.get(316).getEmail());
	}

	@Test
	@DisplayName("Record 317: Web is http://www.amandawanvig.com")
	void WebOfRecord317() {
		assertEquals("http://www.amandawanvig.com", customers.get(316).getWeb());
	}
}
