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

@Tag("37")
class Record_295 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 295: FirstName is Mitsi")
	void FirstNameOfRecord295() {
		assertEquals("Mitsi", customers.get(294).getFirstName());
	}

	@Test
	@DisplayName("Record 295: LastName is Molleda")
	void LastNameOfRecord295() {
		assertEquals("Molleda", customers.get(294).getLastName());
	}

	@Test
	@DisplayName("Record 295: Company is Jackson, Debra O Esq")
	void CompanyOfRecord295() {
		assertEquals("Jackson, Debra O Esq", customers.get(294).getCompany());
	}

	@Test
	@DisplayName("Record 295: Address is 8825 Runamuck Pl")
	void AddressOfRecord295() {
		assertEquals("8825 Runamuck Pl", customers.get(294).getAddress());
	}

	@Test
	@DisplayName("Record 295: City is Anchorage")
	void CityOfRecord295() {
		assertEquals("Anchorage", customers.get(294).getCity());
	}

	@Test
	@DisplayName("Record 295: County is Anchorage")
	void CountyOfRecord295() {
		assertEquals("Anchorage", customers.get(294).getCounty());
	}

	@Test
	@DisplayName("Record 295: State is AK")
	void StateOfRecord295() {
		assertEquals("AK", customers.get(294).getState());
	}

	@Test
	@DisplayName("Record 295: ZIP is 99502")
	void ZIPOfRecord295() {
		assertEquals("99502", customers.get(294).getZIP());
	}

	@Test
	@DisplayName("Record 295: Phone is 907-562-5969")
	void PhoneOfRecord295() {
		assertEquals("907-562-5969", customers.get(294).getPhone());
	}

	@Test
	@DisplayName("Record 295: Fax is 907-562-2526")
	void FaxOfRecord295() {
		assertEquals("907-562-2526", customers.get(294).getFax());
	}

	@Test
	@DisplayName("Record 295: Email is mitsi@molleda.com")
	void EmailOfRecord295() {
		assertEquals("mitsi@molleda.com", customers.get(294).getEmail());
	}

	@Test
	@DisplayName("Record 295: Web is http://www.mitsimolleda.com")
	void WebOfRecord295() {
		assertEquals("http://www.mitsimolleda.com", customers.get(294).getWeb());
	}
}
