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

@Tag("10")
class Record_4843 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4843: FirstName is Josh")
	void FirstNameOfRecord4843() {
		assertEquals("Josh", customers.get(4842).getFirstName());
	}

	@Test
	@DisplayName("Record 4843: LastName is Kristoff")
	void LastNameOfRecord4843() {
		assertEquals("Kristoff", customers.get(4842).getLastName());
	}

	@Test
	@DisplayName("Record 4843: Company is Vincent, Paul M Esq")
	void CompanyOfRecord4843() {
		assertEquals("Vincent, Paul M Esq", customers.get(4842).getCompany());
	}

	@Test
	@DisplayName("Record 4843: Address is 27 Maple")
	void AddressOfRecord4843() {
		assertEquals("27 Maple", customers.get(4842).getAddress());
	}

	@Test
	@DisplayName("Record 4843: City is Cornish")
	void CityOfRecord4843() {
		assertEquals("Cornish", customers.get(4842).getCity());
	}

	@Test
	@DisplayName("Record 4843: County is York")
	void CountyOfRecord4843() {
		assertEquals("York", customers.get(4842).getCounty());
	}

	@Test
	@DisplayName("Record 4843: State is ME")
	void StateOfRecord4843() {
		assertEquals("ME", customers.get(4842).getState());
	}

	@Test
	@DisplayName("Record 4843: ZIP is 4020")
	void ZIPOfRecord4843() {
		assertEquals("4020", customers.get(4842).getZIP());
	}

	@Test
	@DisplayName("Record 4843: Phone is 207-625-9036")
	void PhoneOfRecord4843() {
		assertEquals("207-625-9036", customers.get(4842).getPhone());
	}

	@Test
	@DisplayName("Record 4843: Fax is 207-625-6049")
	void FaxOfRecord4843() {
		assertEquals("207-625-6049", customers.get(4842).getFax());
	}

	@Test
	@DisplayName("Record 4843: Email is josh@kristoff.com")
	void EmailOfRecord4843() {
		assertEquals("josh@kristoff.com", customers.get(4842).getEmail());
	}

	@Test
	@DisplayName("Record 4843: Web is http://www.joshkristoff.com")
	void WebOfRecord4843() {
		assertEquals("http://www.joshkristoff.com", customers.get(4842).getWeb());
	}
}
