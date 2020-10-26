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

@Tag("47")
class Record_4771 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4771: FirstName is Tisha")
	void FirstNameOfRecord4771() {
		assertEquals("Tisha", customers.get(4770).getFirstName());
	}

	@Test
	@DisplayName("Record 4771: LastName is Brunkhardt")
	void LastNameOfRecord4771() {
		assertEquals("Brunkhardt", customers.get(4770).getLastName());
	}

	@Test
	@DisplayName("Record 4771: Company is Mcgrail, Elizabeth Esq")
	void CompanyOfRecord4771() {
		assertEquals("Mcgrail, Elizabeth Esq", customers.get(4770).getCompany());
	}

	@Test
	@DisplayName("Record 4771: Address is 437 Old Mammoth Rd")
	void AddressOfRecord4771() {
		assertEquals("437 Old Mammoth Rd", customers.get(4770).getAddress());
	}

	@Test
	@DisplayName("Record 4771: City is Mammoth Lakes")
	void CityOfRecord4771() {
		assertEquals("Mammoth Lakes", customers.get(4770).getCity());
	}

	@Test
	@DisplayName("Record 4771: County is Mono")
	void CountyOfRecord4771() {
		assertEquals("Mono", customers.get(4770).getCounty());
	}

	@Test
	@DisplayName("Record 4771: State is CA")
	void StateOfRecord4771() {
		assertEquals("CA", customers.get(4770).getState());
	}

	@Test
	@DisplayName("Record 4771: ZIP is 93546")
	void ZIPOfRecord4771() {
		assertEquals("93546", customers.get(4770).getZIP());
	}

	@Test
	@DisplayName("Record 4771: Phone is 760-934-6895")
	void PhoneOfRecord4771() {
		assertEquals("760-934-6895", customers.get(4770).getPhone());
	}

	@Test
	@DisplayName("Record 4771: Fax is 760-934-5147")
	void FaxOfRecord4771() {
		assertEquals("760-934-5147", customers.get(4770).getFax());
	}

	@Test
	@DisplayName("Record 4771: Email is tisha@brunkhardt.com")
	void EmailOfRecord4771() {
		assertEquals("tisha@brunkhardt.com", customers.get(4770).getEmail());
	}

	@Test
	@DisplayName("Record 4771: Web is http://www.tishabrunkhardt.com")
	void WebOfRecord4771() {
		assertEquals("http://www.tishabrunkhardt.com", customers.get(4770).getWeb());
	}
}
