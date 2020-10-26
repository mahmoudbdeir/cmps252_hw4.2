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

@Tag("43")
class Record_4358 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4358: FirstName is Berry")
	void FirstNameOfRecord4358() {
		assertEquals("Berry", customers.get(4357).getFirstName());
	}

	@Test
	@DisplayName("Record 4358: LastName is Hankerson")
	void LastNameOfRecord4358() {
		assertEquals("Hankerson", customers.get(4357).getLastName());
	}

	@Test
	@DisplayName("Record 4358: Company is Dennis, L Morris Esq")
	void CompanyOfRecord4358() {
		assertEquals("Dennis, L Morris Esq", customers.get(4357).getCompany());
	}

	@Test
	@DisplayName("Record 4358: Address is 86 Buck Rd")
	void AddressOfRecord4358() {
		assertEquals("86 Buck Rd", customers.get(4357).getAddress());
	}

	@Test
	@DisplayName("Record 4358: City is Southampton")
	void CityOfRecord4358() {
		assertEquals("Southampton", customers.get(4357).getCity());
	}

	@Test
	@DisplayName("Record 4358: County is Bucks")
	void CountyOfRecord4358() {
		assertEquals("Bucks", customers.get(4357).getCounty());
	}

	@Test
	@DisplayName("Record 4358: State is PA")
	void StateOfRecord4358() {
		assertEquals("PA", customers.get(4357).getState());
	}

	@Test
	@DisplayName("Record 4358: ZIP is 18966")
	void ZIPOfRecord4358() {
		assertEquals("18966", customers.get(4357).getZIP());
	}

	@Test
	@DisplayName("Record 4358: Phone is 215-355-0355")
	void PhoneOfRecord4358() {
		assertEquals("215-355-0355", customers.get(4357).getPhone());
	}

	@Test
	@DisplayName("Record 4358: Fax is 215-355-5726")
	void FaxOfRecord4358() {
		assertEquals("215-355-5726", customers.get(4357).getFax());
	}

	@Test
	@DisplayName("Record 4358: Email is berry@hankerson.com")
	void EmailOfRecord4358() {
		assertEquals("berry@hankerson.com", customers.get(4357).getEmail());
	}

	@Test
	@DisplayName("Record 4358: Web is http://www.berryhankerson.com")
	void WebOfRecord4358() {
		assertEquals("http://www.berryhankerson.com", customers.get(4357).getWeb());
	}
}
