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

@Tag("16")
class Record_1659 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1659: FirstName is Melisa")
	void FirstNameOfRecord1659() {
		assertEquals("Melisa", customers.get(1658).getFirstName());
	}

	@Test
	@DisplayName("Record 1659: LastName is Bacy")
	void LastNameOfRecord1659() {
		assertEquals("Bacy", customers.get(1658).getLastName());
	}

	@Test
	@DisplayName("Record 1659: Company is Air Flow Inc")
	void CompanyOfRecord1659() {
		assertEquals("Air Flow Inc", customers.get(1658).getCompany());
	}

	@Test
	@DisplayName("Record 1659: Address is 1305 1st St E")
	void AddressOfRecord1659() {
		assertEquals("1305 1st St E", customers.get(1658).getAddress());
	}

	@Test
	@DisplayName("Record 1659: City is Humble")
	void CityOfRecord1659() {
		assertEquals("Humble", customers.get(1658).getCity());
	}

	@Test
	@DisplayName("Record 1659: County is Harris")
	void CountyOfRecord1659() {
		assertEquals("Harris", customers.get(1658).getCounty());
	}

	@Test
	@DisplayName("Record 1659: State is TX")
	void StateOfRecord1659() {
		assertEquals("TX", customers.get(1658).getState());
	}

	@Test
	@DisplayName("Record 1659: ZIP is 77338")
	void ZIPOfRecord1659() {
		assertEquals("77338", customers.get(1658).getZIP());
	}

	@Test
	@DisplayName("Record 1659: Phone is 281-446-4690")
	void PhoneOfRecord1659() {
		assertEquals("281-446-4690", customers.get(1658).getPhone());
	}

	@Test
	@DisplayName("Record 1659: Fax is 281-446-4391")
	void FaxOfRecord1659() {
		assertEquals("281-446-4391", customers.get(1658).getFax());
	}

	@Test
	@DisplayName("Record 1659: Email is melisa@bacy.com")
	void EmailOfRecord1659() {
		assertEquals("melisa@bacy.com", customers.get(1658).getEmail());
	}

	@Test
	@DisplayName("Record 1659: Web is http://www.melisabacy.com")
	void WebOfRecord1659() {
		assertEquals("http://www.melisabacy.com", customers.get(1658).getWeb());
	}
}
