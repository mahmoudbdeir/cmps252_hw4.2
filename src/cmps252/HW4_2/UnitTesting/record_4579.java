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

@Tag("48")
class Record_4579 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4579: FirstName is Sierra")
	void FirstNameOfRecord4579() {
		assertEquals("Sierra", customers.get(4578).getFirstName());
	}

	@Test
	@DisplayName("Record 4579: LastName is Schimming")
	void LastNameOfRecord4579() {
		assertEquals("Schimming", customers.get(4578).getLastName());
	}

	@Test
	@DisplayName("Record 4579: Company is Arion Press")
	void CompanyOfRecord4579() {
		assertEquals("Arion Press", customers.get(4578).getCompany());
	}

	@Test
	@DisplayName("Record 4579: Address is 4810 Ellestad Dr")
	void AddressOfRecord4579() {
		assertEquals("4810 Ellestad Dr", customers.get(4578).getAddress());
	}

	@Test
	@DisplayName("Record 4579: City is Madison")
	void CityOfRecord4579() {
		assertEquals("Madison", customers.get(4578).getCity());
	}

	@Test
	@DisplayName("Record 4579: County is Dane")
	void CountyOfRecord4579() {
		assertEquals("Dane", customers.get(4578).getCounty());
	}

	@Test
	@DisplayName("Record 4579: State is WI")
	void StateOfRecord4579() {
		assertEquals("WI", customers.get(4578).getState());
	}

	@Test
	@DisplayName("Record 4579: ZIP is 53716")
	void ZIPOfRecord4579() {
		assertEquals("53716", customers.get(4578).getZIP());
	}

	@Test
	@DisplayName("Record 4579: Phone is 608-222-8187")
	void PhoneOfRecord4579() {
		assertEquals("608-222-8187", customers.get(4578).getPhone());
	}

	@Test
	@DisplayName("Record 4579: Fax is 608-222-5767")
	void FaxOfRecord4579() {
		assertEquals("608-222-5767", customers.get(4578).getFax());
	}

	@Test
	@DisplayName("Record 4579: Email is sierra@schimming.com")
	void EmailOfRecord4579() {
		assertEquals("sierra@schimming.com", customers.get(4578).getEmail());
	}

	@Test
	@DisplayName("Record 4579: Web is http://www.sierraschimming.com")
	void WebOfRecord4579() {
		assertEquals("http://www.sierraschimming.com", customers.get(4578).getWeb());
	}
}
