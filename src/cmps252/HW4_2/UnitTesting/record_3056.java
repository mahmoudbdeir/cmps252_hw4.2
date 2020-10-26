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
class Record_3056 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3056: FirstName is Erma")
	void FirstNameOfRecord3056() {
		assertEquals("Erma", customers.get(3055).getFirstName());
	}

	@Test
	@DisplayName("Record 3056: LastName is Patry")
	void LastNameOfRecord3056() {
		assertEquals("Patry", customers.get(3055).getLastName());
	}

	@Test
	@DisplayName("Record 3056: Company is Rode, John Kenneth Esq")
	void CompanyOfRecord3056() {
		assertEquals("Rode, John Kenneth Esq", customers.get(3055).getCompany());
	}

	@Test
	@DisplayName("Record 3056: Address is 6731 W Norvell Bryant Hwy")
	void AddressOfRecord3056() {
		assertEquals("6731 W Norvell Bryant Hwy", customers.get(3055).getAddress());
	}

	@Test
	@DisplayName("Record 3056: City is Crystal River")
	void CityOfRecord3056() {
		assertEquals("Crystal River", customers.get(3055).getCity());
	}

	@Test
	@DisplayName("Record 3056: County is Citrus")
	void CountyOfRecord3056() {
		assertEquals("Citrus", customers.get(3055).getCounty());
	}

	@Test
	@DisplayName("Record 3056: State is FL")
	void StateOfRecord3056() {
		assertEquals("FL", customers.get(3055).getState());
	}

	@Test
	@DisplayName("Record 3056: ZIP is 34429")
	void ZIPOfRecord3056() {
		assertEquals("34429", customers.get(3055).getZIP());
	}

	@Test
	@DisplayName("Record 3056: Phone is 352-563-1790")
	void PhoneOfRecord3056() {
		assertEquals("352-563-1790", customers.get(3055).getPhone());
	}

	@Test
	@DisplayName("Record 3056: Fax is 352-563-1079")
	void FaxOfRecord3056() {
		assertEquals("352-563-1079", customers.get(3055).getFax());
	}

	@Test
	@DisplayName("Record 3056: Email is erma@patry.com")
	void EmailOfRecord3056() {
		assertEquals("erma@patry.com", customers.get(3055).getEmail());
	}

	@Test
	@DisplayName("Record 3056: Web is http://www.ermapatry.com")
	void WebOfRecord3056() {
		assertEquals("http://www.ermapatry.com", customers.get(3055).getWeb());
	}
}
