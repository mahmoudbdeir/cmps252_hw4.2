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

@Tag("2")
class Record_2632 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2632: FirstName is Petra")
	void FirstNameOfRecord2632() {
		assertEquals("Petra", customers.get(2631).getFirstName());
	}

	@Test
	@DisplayName("Record 2632: LastName is Newberg")
	void LastNameOfRecord2632() {
		assertEquals("Newberg", customers.get(2631).getLastName());
	}

	@Test
	@DisplayName("Record 2632: Company is Kane, John J Esq")
	void CompanyOfRecord2632() {
		assertEquals("Kane, John J Esq", customers.get(2631).getCompany());
	}

	@Test
	@DisplayName("Record 2632: Address is 94172 Leoole St")
	void AddressOfRecord2632() {
		assertEquals("94172 Leoole St", customers.get(2631).getAddress());
	}

	@Test
	@DisplayName("Record 2632: City is Waipahu")
	void CityOfRecord2632() {
		assertEquals("Waipahu", customers.get(2631).getCity());
	}

	@Test
	@DisplayName("Record 2632: County is Honolulu")
	void CountyOfRecord2632() {
		assertEquals("Honolulu", customers.get(2631).getCounty());
	}

	@Test
	@DisplayName("Record 2632: State is HI")
	void StateOfRecord2632() {
		assertEquals("HI", customers.get(2631).getState());
	}

	@Test
	@DisplayName("Record 2632: ZIP is 96797")
	void ZIPOfRecord2632() {
		assertEquals("96797", customers.get(2631).getZIP());
	}

	@Test
	@DisplayName("Record 2632: Phone is 808-247-7320")
	void PhoneOfRecord2632() {
		assertEquals("808-247-7320", customers.get(2631).getPhone());
	}

	@Test
	@DisplayName("Record 2632: Fax is 808-247-5357")
	void FaxOfRecord2632() {
		assertEquals("808-247-5357", customers.get(2631).getFax());
	}

	@Test
	@DisplayName("Record 2632: Email is petra@newberg.com")
	void EmailOfRecord2632() {
		assertEquals("petra@newberg.com", customers.get(2631).getEmail());
	}

	@Test
	@DisplayName("Record 2632: Web is http://www.petranewberg.com")
	void WebOfRecord2632() {
		assertEquals("http://www.petranewberg.com", customers.get(2631).getWeb());
	}
}
