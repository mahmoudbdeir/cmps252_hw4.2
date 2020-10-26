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

@Tag("22")
class Record_4577 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4577: FirstName is Larry")
	void FirstNameOfRecord4577() {
		assertEquals("Larry", customers.get(4576).getFirstName());
	}

	@Test
	@DisplayName("Record 4577: LastName is Dwaileebe")
	void LastNameOfRecord4577() {
		assertEquals("Dwaileebe", customers.get(4576).getLastName());
	}

	@Test
	@DisplayName("Record 4577: Company is Smida, Thomas F Esq")
	void CompanyOfRecord4577() {
		assertEquals("Smida, Thomas F Esq", customers.get(4576).getCompany());
	}

	@Test
	@DisplayName("Record 4577: Address is 9819 Bustleton Ave")
	void AddressOfRecord4577() {
		assertEquals("9819 Bustleton Ave", customers.get(4576).getAddress());
	}

	@Test
	@DisplayName("Record 4577: City is Philadelphia")
	void CityOfRecord4577() {
		assertEquals("Philadelphia", customers.get(4576).getCity());
	}

	@Test
	@DisplayName("Record 4577: County is Philadelphia")
	void CountyOfRecord4577() {
		assertEquals("Philadelphia", customers.get(4576).getCounty());
	}

	@Test
	@DisplayName("Record 4577: State is PA")
	void StateOfRecord4577() {
		assertEquals("PA", customers.get(4576).getState());
	}

	@Test
	@DisplayName("Record 4577: ZIP is 19115")
	void ZIPOfRecord4577() {
		assertEquals("19115", customers.get(4576).getZIP());
	}

	@Test
	@DisplayName("Record 4577: Phone is 215-673-3184")
	void PhoneOfRecord4577() {
		assertEquals("215-673-3184", customers.get(4576).getPhone());
	}

	@Test
	@DisplayName("Record 4577: Fax is 215-673-5094")
	void FaxOfRecord4577() {
		assertEquals("215-673-5094", customers.get(4576).getFax());
	}

	@Test
	@DisplayName("Record 4577: Email is larry@dwaileebe.com")
	void EmailOfRecord4577() {
		assertEquals("larry@dwaileebe.com", customers.get(4576).getEmail());
	}

	@Test
	@DisplayName("Record 4577: Web is http://www.larrydwaileebe.com")
	void WebOfRecord4577() {
		assertEquals("http://www.larrydwaileebe.com", customers.get(4576).getWeb());
	}
}
