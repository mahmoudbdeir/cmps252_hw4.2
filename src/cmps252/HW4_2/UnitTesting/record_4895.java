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

@Tag("46")
class Record_4895 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4895: FirstName is Sonya")
	void FirstNameOfRecord4895() {
		assertEquals("Sonya", customers.get(4894).getFirstName());
	}

	@Test
	@DisplayName("Record 4895: LastName is Stansbury")
	void LastNameOfRecord4895() {
		assertEquals("Stansbury", customers.get(4894).getLastName());
	}

	@Test
	@DisplayName("Record 4895: Company is Mold A Matic Corp")
	void CompanyOfRecord4895() {
		assertEquals("Mold A Matic Corp", customers.get(4894).getCompany());
	}

	@Test
	@DisplayName("Record 4895: Address is 8401 Las Camas Rd Ne")
	void AddressOfRecord4895() {
		assertEquals("8401 Las Camas Rd Ne", customers.get(4894).getAddress());
	}

	@Test
	@DisplayName("Record 4895: City is Albuquerque")
	void CityOfRecord4895() {
		assertEquals("Albuquerque", customers.get(4894).getCity());
	}

	@Test
	@DisplayName("Record 4895: County is Bernalillo")
	void CountyOfRecord4895() {
		assertEquals("Bernalillo", customers.get(4894).getCounty());
	}

	@Test
	@DisplayName("Record 4895: State is NM")
	void StateOfRecord4895() {
		assertEquals("NM", customers.get(4894).getState());
	}

	@Test
	@DisplayName("Record 4895: ZIP is 87111")
	void ZIPOfRecord4895() {
		assertEquals("87111", customers.get(4894).getZIP());
	}

	@Test
	@DisplayName("Record 4895: Phone is 505-291-1522")
	void PhoneOfRecord4895() {
		assertEquals("505-291-1522", customers.get(4894).getPhone());
	}

	@Test
	@DisplayName("Record 4895: Fax is 505-291-2919")
	void FaxOfRecord4895() {
		assertEquals("505-291-2919", customers.get(4894).getFax());
	}

	@Test
	@DisplayName("Record 4895: Email is sonya@stansbury.com")
	void EmailOfRecord4895() {
		assertEquals("sonya@stansbury.com", customers.get(4894).getEmail());
	}

	@Test
	@DisplayName("Record 4895: Web is http://www.sonyastansbury.com")
	void WebOfRecord4895() {
		assertEquals("http://www.sonyastansbury.com", customers.get(4894).getWeb());
	}
}
