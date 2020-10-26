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

@Tag("19")
class Record_4229 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4229: FirstName is Britney")
	void FirstNameOfRecord4229() {
		assertEquals("Britney", customers.get(4228).getFirstName());
	}

	@Test
	@DisplayName("Record 4229: LastName is Shand")
	void LastNameOfRecord4229() {
		assertEquals("Shand", customers.get(4228).getLastName());
	}

	@Test
	@DisplayName("Record 4229: Company is Christopher, Cynthia A")
	void CompanyOfRecord4229() {
		assertEquals("Christopher, Cynthia A", customers.get(4228).getCompany());
	}

	@Test
	@DisplayName("Record 4229: Address is Box #-2147")
	void AddressOfRecord4229() {
		assertEquals("Box #-2147", customers.get(4228).getAddress());
	}

	@Test
	@DisplayName("Record 4229: City is San Ramon")
	void CityOfRecord4229() {
		assertEquals("San Ramon", customers.get(4228).getCity());
	}

	@Test
	@DisplayName("Record 4229: County is Contra Costa")
	void CountyOfRecord4229() {
		assertEquals("Contra Costa", customers.get(4228).getCounty());
	}

	@Test
	@DisplayName("Record 4229: State is CA")
	void StateOfRecord4229() {
		assertEquals("CA", customers.get(4228).getState());
	}

	@Test
	@DisplayName("Record 4229: ZIP is 94583")
	void ZIPOfRecord4229() {
		assertEquals("94583", customers.get(4228).getZIP());
	}

	@Test
	@DisplayName("Record 4229: Phone is 925-687-0274")
	void PhoneOfRecord4229() {
		assertEquals("925-687-0274", customers.get(4228).getPhone());
	}

	@Test
	@DisplayName("Record 4229: Fax is 925-687-0491")
	void FaxOfRecord4229() {
		assertEquals("925-687-0491", customers.get(4228).getFax());
	}

	@Test
	@DisplayName("Record 4229: Email is britney@shand.com")
	void EmailOfRecord4229() {
		assertEquals("britney@shand.com", customers.get(4228).getEmail());
	}

	@Test
	@DisplayName("Record 4229: Web is http://www.britneyshand.com")
	void WebOfRecord4229() {
		assertEquals("http://www.britneyshand.com", customers.get(4228).getWeb());
	}
}
