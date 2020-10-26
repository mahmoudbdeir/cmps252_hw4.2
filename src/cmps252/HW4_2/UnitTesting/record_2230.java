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

@Tag("38")
class Record_2230 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2230: FirstName is Rachel")
	void FirstNameOfRecord2230() {
		assertEquals("Rachel", customers.get(2229).getFirstName());
	}

	@Test
	@DisplayName("Record 2230: LastName is Samiento")
	void LastNameOfRecord2230() {
		assertEquals("Samiento", customers.get(2229).getLastName());
	}

	@Test
	@DisplayName("Record 2230: Company is Allied Business Forms")
	void CompanyOfRecord2230() {
		assertEquals("Allied Business Forms", customers.get(2229).getCompany());
	}

	@Test
	@DisplayName("Record 2230: Address is 303 W Wood St")
	void AddressOfRecord2230() {
		assertEquals("303 W Wood St", customers.get(2229).getAddress());
	}

	@Test
	@DisplayName("Record 2230: City is Carlsbad")
	void CityOfRecord2230() {
		assertEquals("Carlsbad", customers.get(2229).getCity());
	}

	@Test
	@DisplayName("Record 2230: County is Eddy")
	void CountyOfRecord2230() {
		assertEquals("Eddy", customers.get(2229).getCounty());
	}

	@Test
	@DisplayName("Record 2230: State is NM")
	void StateOfRecord2230() {
		assertEquals("NM", customers.get(2229).getState());
	}

	@Test
	@DisplayName("Record 2230: ZIP is 88220")
	void ZIPOfRecord2230() {
		assertEquals("88220", customers.get(2229).getZIP());
	}

	@Test
	@DisplayName("Record 2230: Phone is 505-887-3902")
	void PhoneOfRecord2230() {
		assertEquals("505-887-3902", customers.get(2229).getPhone());
	}

	@Test
	@DisplayName("Record 2230: Fax is 505-887-1863")
	void FaxOfRecord2230() {
		assertEquals("505-887-1863", customers.get(2229).getFax());
	}

	@Test
	@DisplayName("Record 2230: Email is rachel@samiento.com")
	void EmailOfRecord2230() {
		assertEquals("rachel@samiento.com", customers.get(2229).getEmail());
	}

	@Test
	@DisplayName("Record 2230: Web is http://www.rachelsamiento.com")
	void WebOfRecord2230() {
		assertEquals("http://www.rachelsamiento.com", customers.get(2229).getWeb());
	}
}
