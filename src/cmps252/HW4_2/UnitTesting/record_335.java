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

@Tag("11")
class Record_335 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 335: FirstName is Filiberto")
	void FirstNameOfRecord335() {
		assertEquals("Filiberto", customers.get(334).getFirstName());
	}

	@Test
	@DisplayName("Record 335: LastName is Chavous")
	void LastNameOfRecord335() {
		assertEquals("Chavous", customers.get(334).getLastName());
	}

	@Test
	@DisplayName("Record 335: Company is Strickland, D Michael Esq")
	void CompanyOfRecord335() {
		assertEquals("Strickland, D Michael Esq", customers.get(334).getCompany());
	}

	@Test
	@DisplayName("Record 335: Address is 949 N Cataract Ave  #-1")
	void AddressOfRecord335() {
		assertEquals("949 N Cataract Ave  #-1", customers.get(334).getAddress());
	}

	@Test
	@DisplayName("Record 335: City is San Dimas")
	void CityOfRecord335() {
		assertEquals("San Dimas", customers.get(334).getCity());
	}

	@Test
	@DisplayName("Record 335: County is Los Angeles")
	void CountyOfRecord335() {
		assertEquals("Los Angeles", customers.get(334).getCounty());
	}

	@Test
	@DisplayName("Record 335: State is CA")
	void StateOfRecord335() {
		assertEquals("CA", customers.get(334).getState());
	}

	@Test
	@DisplayName("Record 335: ZIP is 91773")
	void ZIPOfRecord335() {
		assertEquals("91773", customers.get(334).getZIP());
	}

	@Test
	@DisplayName("Record 335: Phone is 909-599-5890")
	void PhoneOfRecord335() {
		assertEquals("909-599-5890", customers.get(334).getPhone());
	}

	@Test
	@DisplayName("Record 335: Fax is 909-599-2016")
	void FaxOfRecord335() {
		assertEquals("909-599-2016", customers.get(334).getFax());
	}

	@Test
	@DisplayName("Record 335: Email is filiberto@chavous.com")
	void EmailOfRecord335() {
		assertEquals("filiberto@chavous.com", customers.get(334).getEmail());
	}

	@Test
	@DisplayName("Record 335: Web is http://www.filibertochavous.com")
	void WebOfRecord335() {
		assertEquals("http://www.filibertochavous.com", customers.get(334).getWeb());
	}
}
