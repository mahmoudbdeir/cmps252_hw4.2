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

@Tag("23")
class Record_4381 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4381: FirstName is Selena")
	void FirstNameOfRecord4381() {
		assertEquals("Selena", customers.get(4380).getFirstName());
	}

	@Test
	@DisplayName("Record 4381: LastName is Sakal")
	void LastNameOfRecord4381() {
		assertEquals("Sakal", customers.get(4380).getLastName());
	}

	@Test
	@DisplayName("Record 4381: Company is Martin, Marshall G Esq")
	void CompanyOfRecord4381() {
		assertEquals("Martin, Marshall G Esq", customers.get(4380).getCompany());
	}

	@Test
	@DisplayName("Record 4381: Address is 86 Buck Rd")
	void AddressOfRecord4381() {
		assertEquals("86 Buck Rd", customers.get(4380).getAddress());
	}

	@Test
	@DisplayName("Record 4381: City is Southampton")
	void CityOfRecord4381() {
		assertEquals("Southampton", customers.get(4380).getCity());
	}

	@Test
	@DisplayName("Record 4381: County is Bucks")
	void CountyOfRecord4381() {
		assertEquals("Bucks", customers.get(4380).getCounty());
	}

	@Test
	@DisplayName("Record 4381: State is PA")
	void StateOfRecord4381() {
		assertEquals("PA", customers.get(4380).getState());
	}

	@Test
	@DisplayName("Record 4381: ZIP is 18966")
	void ZIPOfRecord4381() {
		assertEquals("18966", customers.get(4380).getZIP());
	}

	@Test
	@DisplayName("Record 4381: Phone is 215-355-1829")
	void PhoneOfRecord4381() {
		assertEquals("215-355-1829", customers.get(4380).getPhone());
	}

	@Test
	@DisplayName("Record 4381: Fax is 215-355-9689")
	void FaxOfRecord4381() {
		assertEquals("215-355-9689", customers.get(4380).getFax());
	}

	@Test
	@DisplayName("Record 4381: Email is selena@sakal.com")
	void EmailOfRecord4381() {
		assertEquals("selena@sakal.com", customers.get(4380).getEmail());
	}

	@Test
	@DisplayName("Record 4381: Web is http://www.selenasakal.com")
	void WebOfRecord4381() {
		assertEquals("http://www.selenasakal.com", customers.get(4380).getWeb());
	}
}
