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

@Tag("36")
class Record_4268 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4268: FirstName is Marcellus")
	void FirstNameOfRecord4268() {
		assertEquals("Marcellus", customers.get(4267).getFirstName());
	}

	@Test
	@DisplayName("Record 4268: LastName is Pearle")
	void LastNameOfRecord4268() {
		assertEquals("Pearle", customers.get(4267).getLastName());
	}

	@Test
	@DisplayName("Record 4268: Company is Hughson Nut")
	void CompanyOfRecord4268() {
		assertEquals("Hughson Nut", customers.get(4267).getCompany());
	}

	@Test
	@DisplayName("Record 4268: Address is 100 E Wisconsin Ave")
	void AddressOfRecord4268() {
		assertEquals("100 E Wisconsin Ave", customers.get(4267).getAddress());
	}

	@Test
	@DisplayName("Record 4268: City is Milwaukee")
	void CityOfRecord4268() {
		assertEquals("Milwaukee", customers.get(4267).getCity());
	}

	@Test
	@DisplayName("Record 4268: County is Milwaukee")
	void CountyOfRecord4268() {
		assertEquals("Milwaukee", customers.get(4267).getCounty());
	}

	@Test
	@DisplayName("Record 4268: State is WI")
	void StateOfRecord4268() {
		assertEquals("WI", customers.get(4267).getState());
	}

	@Test
	@DisplayName("Record 4268: ZIP is 53202")
	void ZIPOfRecord4268() {
		assertEquals("53202", customers.get(4267).getZIP());
	}

	@Test
	@DisplayName("Record 4268: Phone is 414-271-7674")
	void PhoneOfRecord4268() {
		assertEquals("414-271-7674", customers.get(4267).getPhone());
	}

	@Test
	@DisplayName("Record 4268: Fax is 414-271-1075")
	void FaxOfRecord4268() {
		assertEquals("414-271-1075", customers.get(4267).getFax());
	}

	@Test
	@DisplayName("Record 4268: Email is marcellus@pearle.com")
	void EmailOfRecord4268() {
		assertEquals("marcellus@pearle.com", customers.get(4267).getEmail());
	}

	@Test
	@DisplayName("Record 4268: Web is http://www.marcelluspearle.com")
	void WebOfRecord4268() {
		assertEquals("http://www.marcelluspearle.com", customers.get(4267).getWeb());
	}
}
