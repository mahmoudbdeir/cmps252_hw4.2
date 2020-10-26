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

@Tag("44")
class Record_4273 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4273: FirstName is Chet")
	void FirstNameOfRecord4273() {
		assertEquals("Chet", customers.get(4272).getFirstName());
	}

	@Test
	@DisplayName("Record 4273: LastName is Zugg")
	void LastNameOfRecord4273() {
		assertEquals("Zugg", customers.get(4272).getLastName());
	}

	@Test
	@DisplayName("Record 4273: Company is Duncan, Parker W Esq")
	void CompanyOfRecord4273() {
		assertEquals("Duncan, Parker W Esq", customers.get(4272).getCompany());
	}

	@Test
	@DisplayName("Record 4273: Address is 1818 Market St")
	void AddressOfRecord4273() {
		assertEquals("1818 Market St", customers.get(4272).getAddress());
	}

	@Test
	@DisplayName("Record 4273: City is Philadelphia")
	void CityOfRecord4273() {
		assertEquals("Philadelphia", customers.get(4272).getCity());
	}

	@Test
	@DisplayName("Record 4273: County is Philadelphia")
	void CountyOfRecord4273() {
		assertEquals("Philadelphia", customers.get(4272).getCounty());
	}

	@Test
	@DisplayName("Record 4273: State is PA")
	void StateOfRecord4273() {
		assertEquals("PA", customers.get(4272).getState());
	}

	@Test
	@DisplayName("Record 4273: ZIP is 19103")
	void ZIPOfRecord4273() {
		assertEquals("19103", customers.get(4272).getZIP());
	}

	@Test
	@DisplayName("Record 4273: Phone is 215-569-3385")
	void PhoneOfRecord4273() {
		assertEquals("215-569-3385", customers.get(4272).getPhone());
	}

	@Test
	@DisplayName("Record 4273: Fax is 215-569-6532")
	void FaxOfRecord4273() {
		assertEquals("215-569-6532", customers.get(4272).getFax());
	}

	@Test
	@DisplayName("Record 4273: Email is chet@zugg.com")
	void EmailOfRecord4273() {
		assertEquals("chet@zugg.com", customers.get(4272).getEmail());
	}

	@Test
	@DisplayName("Record 4273: Web is http://www.chetsugg.com")
	void WebOfRecord4273() {
		assertEquals("http://www.chetsugg.com", customers.get(4272).getWeb());
	}
}
