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

@Tag("28")
class Record_4289 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4289: FirstName is Rupert")
	void FirstNameOfRecord4289() {
		assertEquals("Rupert", customers.get(4288).getFirstName());
	}

	@Test
	@DisplayName("Record 4289: LastName is Earlywine")
	void LastNameOfRecord4289() {
		assertEquals("Earlywine", customers.get(4288).getLastName());
	}

	@Test
	@DisplayName("Record 4289: Company is Bowen & Warengo Sheet Metal")
	void CompanyOfRecord4289() {
		assertEquals("Bowen & Warengo Sheet Metal", customers.get(4288).getCompany());
	}

	@Test
	@DisplayName("Record 4289: Address is 205 N Washington Ave")
	void AddressOfRecord4289() {
		assertEquals("205 N Washington Ave", customers.get(4288).getAddress());
	}

	@Test
	@DisplayName("Record 4289: City is Scranton")
	void CityOfRecord4289() {
		assertEquals("Scranton", customers.get(4288).getCity());
	}

	@Test
	@DisplayName("Record 4289: County is Lackawanna")
	void CountyOfRecord4289() {
		assertEquals("Lackawanna", customers.get(4288).getCounty());
	}

	@Test
	@DisplayName("Record 4289: State is PA")
	void StateOfRecord4289() {
		assertEquals("PA", customers.get(4288).getState());
	}

	@Test
	@DisplayName("Record 4289: ZIP is 18503")
	void ZIPOfRecord4289() {
		assertEquals("18503", customers.get(4288).getZIP());
	}

	@Test
	@DisplayName("Record 4289: Phone is 570-348-2667")
	void PhoneOfRecord4289() {
		assertEquals("570-348-2667", customers.get(4288).getPhone());
	}

	@Test
	@DisplayName("Record 4289: Fax is 570-348-2574")
	void FaxOfRecord4289() {
		assertEquals("570-348-2574", customers.get(4288).getFax());
	}

	@Test
	@DisplayName("Record 4289: Email is rupert@earlywine.com")
	void EmailOfRecord4289() {
		assertEquals("rupert@earlywine.com", customers.get(4288).getEmail());
	}

	@Test
	@DisplayName("Record 4289: Web is http://www.rupertearlywine.com")
	void WebOfRecord4289() {
		assertEquals("http://www.rupertearlywine.com", customers.get(4288).getWeb());
	}
}
