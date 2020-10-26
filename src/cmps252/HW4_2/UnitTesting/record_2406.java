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

@Tag("16")
class Record_2406 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2406: FirstName is Tyrone")
	void FirstNameOfRecord2406() {
		assertEquals("Tyrone", customers.get(2405).getFirstName());
	}

	@Test
	@DisplayName("Record 2406: LastName is Hatten")
	void LastNameOfRecord2406() {
		assertEquals("Hatten", customers.get(2405).getLastName());
	}

	@Test
	@DisplayName("Record 2406: Company is Resnick, Kenneth A Esq")
	void CompanyOfRecord2406() {
		assertEquals("Resnick, Kenneth A Esq", customers.get(2405).getCompany());
	}

	@Test
	@DisplayName("Record 2406: Address is 247 Wyoming Ave")
	void AddressOfRecord2406() {
		assertEquals("247 Wyoming Ave", customers.get(2405).getAddress());
	}

	@Test
	@DisplayName("Record 2406: City is Scranton")
	void CityOfRecord2406() {
		assertEquals("Scranton", customers.get(2405).getCity());
	}

	@Test
	@DisplayName("Record 2406: County is Lackawanna")
	void CountyOfRecord2406() {
		assertEquals("Lackawanna", customers.get(2405).getCounty());
	}

	@Test
	@DisplayName("Record 2406: State is PA")
	void StateOfRecord2406() {
		assertEquals("PA", customers.get(2405).getState());
	}

	@Test
	@DisplayName("Record 2406: ZIP is 18503")
	void ZIPOfRecord2406() {
		assertEquals("18503", customers.get(2405).getZIP());
	}

	@Test
	@DisplayName("Record 2406: Phone is 570-347-9331")
	void PhoneOfRecord2406() {
		assertEquals("570-347-9331", customers.get(2405).getPhone());
	}

	@Test
	@DisplayName("Record 2406: Fax is 570-347-6758")
	void FaxOfRecord2406() {
		assertEquals("570-347-6758", customers.get(2405).getFax());
	}

	@Test
	@DisplayName("Record 2406: Email is tyrone@hatten.com")
	void EmailOfRecord2406() {
		assertEquals("tyrone@hatten.com", customers.get(2405).getEmail());
	}

	@Test
	@DisplayName("Record 2406: Web is http://www.tyronehatten.com")
	void WebOfRecord2406() {
		assertEquals("http://www.tyronehatten.com", customers.get(2405).getWeb());
	}
}
