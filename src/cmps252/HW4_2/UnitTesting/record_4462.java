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

@Tag("11")
class Record_4462 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4462: FirstName is Candida")
	void FirstNameOfRecord4462() {
		assertEquals("Candida", customers.get(4461).getFirstName());
	}

	@Test
	@DisplayName("Record 4462: LastName is Muney")
	void LastNameOfRecord4462() {
		assertEquals("Muney", customers.get(4461).getLastName());
	}

	@Test
	@DisplayName("Record 4462: Company is Kelly Hamer Gardner")
	void CompanyOfRecord4462() {
		assertEquals("Kelly Hamer Gardner", customers.get(4461).getCompany());
	}

	@Test
	@DisplayName("Record 4462: Address is 2060 3rd St")
	void AddressOfRecord4462() {
		assertEquals("2060 3rd St", customers.get(4461).getAddress());
	}

	@Test
	@DisplayName("Record 4462: City is Oroville")
	void CityOfRecord4462() {
		assertEquals("Oroville", customers.get(4461).getCity());
	}

	@Test
	@DisplayName("Record 4462: County is Butte")
	void CountyOfRecord4462() {
		assertEquals("Butte", customers.get(4461).getCounty());
	}

	@Test
	@DisplayName("Record 4462: State is CA")
	void StateOfRecord4462() {
		assertEquals("CA", customers.get(4461).getState());
	}

	@Test
	@DisplayName("Record 4462: ZIP is 95965")
	void ZIPOfRecord4462() {
		assertEquals("95965", customers.get(4461).getZIP());
	}

	@Test
	@DisplayName("Record 4462: Phone is 530-533-1314")
	void PhoneOfRecord4462() {
		assertEquals("530-533-1314", customers.get(4461).getPhone());
	}

	@Test
	@DisplayName("Record 4462: Fax is 530-533-0094")
	void FaxOfRecord4462() {
		assertEquals("530-533-0094", customers.get(4461).getFax());
	}

	@Test
	@DisplayName("Record 4462: Email is candida@muney.com")
	void EmailOfRecord4462() {
		assertEquals("candida@muney.com", customers.get(4461).getEmail());
	}

	@Test
	@DisplayName("Record 4462: Web is http://www.candidamuney.com")
	void WebOfRecord4462() {
		assertEquals("http://www.candidamuney.com", customers.get(4461).getWeb());
	}
}
