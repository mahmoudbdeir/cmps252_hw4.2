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

@Tag("37")
class Record_2383 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2383: FirstName is Taylor")
	void FirstNameOfRecord2383() {
		assertEquals("Taylor", customers.get(2382).getFirstName());
	}

	@Test
	@DisplayName("Record 2383: LastName is Highnote")
	void LastNameOfRecord2383() {
		assertEquals("Highnote", customers.get(2382).getLastName());
	}

	@Test
	@DisplayName("Record 2383: Company is Nadis, Ronn S Esq")
	void CompanyOfRecord2383() {
		assertEquals("Nadis, Ronn S Esq", customers.get(2382).getCompany());
	}

	@Test
	@DisplayName("Record 2383: Address is 520 E Central Park Ave S")
	void AddressOfRecord2383() {
		assertEquals("520 E Central Park Ave S", customers.get(2382).getAddress());
	}

	@Test
	@DisplayName("Record 2383: City is Anahym")
	void CityOfRecord2383() {
		assertEquals("Anahym", customers.get(2382).getCity());
	}

	@Test
	@DisplayName("Record 2383: County is Orange")
	void CountyOfRecord2383() {
		assertEquals("Orange", customers.get(2382).getCounty());
	}

	@Test
	@DisplayName("Record 2383: State is CA")
	void StateOfRecord2383() {
		assertEquals("CA", customers.get(2382).getState());
	}

	@Test
	@DisplayName("Record 2383: ZIP is 92802")
	void ZIPOfRecord2383() {
		assertEquals("92802", customers.get(2382).getZIP());
	}

	@Test
	@DisplayName("Record 2383: Phone is 714-778-3333")
	void PhoneOfRecord2383() {
		assertEquals("714-778-3333", customers.get(2382).getPhone());
	}

	@Test
	@DisplayName("Record 2383: Fax is 714-778-5609")
	void FaxOfRecord2383() {
		assertEquals("714-778-5609", customers.get(2382).getFax());
	}

	@Test
	@DisplayName("Record 2383: Email is taylor@highnote.com")
	void EmailOfRecord2383() {
		assertEquals("taylor@highnote.com", customers.get(2382).getEmail());
	}

	@Test
	@DisplayName("Record 2383: Web is http://www.taylorhighnote.com")
	void WebOfRecord2383() {
		assertEquals("http://www.taylorhighnote.com", customers.get(2382).getWeb());
	}
}
