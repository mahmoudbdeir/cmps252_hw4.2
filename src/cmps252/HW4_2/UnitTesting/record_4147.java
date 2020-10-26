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

@Tag("0")
class Record_4147 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4147: FirstName is Antone")
	void FirstNameOfRecord4147() {
		assertEquals("Antone", customers.get(4146).getFirstName());
	}

	@Test
	@DisplayName("Record 4147: LastName is Stiman")
	void LastNameOfRecord4147() {
		assertEquals("Stiman", customers.get(4146).getLastName());
	}

	@Test
	@DisplayName("Record 4147: Company is Artesia Fire Equip Sls & Svc")
	void CompanyOfRecord4147() {
		assertEquals("Artesia Fire Equip Sls & Svc", customers.get(4146).getCompany());
	}

	@Test
	@DisplayName("Record 4147: Address is 356 Martin Ave")
	void AddressOfRecord4147() {
		assertEquals("356 Martin Ave", customers.get(4146).getAddress());
	}

	@Test
	@DisplayName("Record 4147: City is Santa Clara")
	void CityOfRecord4147() {
		assertEquals("Santa Clara", customers.get(4146).getCity());
	}

	@Test
	@DisplayName("Record 4147: County is Santa Clara")
	void CountyOfRecord4147() {
		assertEquals("Santa Clara", customers.get(4146).getCounty());
	}

	@Test
	@DisplayName("Record 4147: State is CA")
	void StateOfRecord4147() {
		assertEquals("CA", customers.get(4146).getState());
	}

	@Test
	@DisplayName("Record 4147: ZIP is 95050")
	void ZIPOfRecord4147() {
		assertEquals("95050", customers.get(4146).getZIP());
	}

	@Test
	@DisplayName("Record 4147: Phone is 408-727-9752")
	void PhoneOfRecord4147() {
		assertEquals("408-727-9752", customers.get(4146).getPhone());
	}

	@Test
	@DisplayName("Record 4147: Fax is 408-727-0305")
	void FaxOfRecord4147() {
		assertEquals("408-727-0305", customers.get(4146).getFax());
	}

	@Test
	@DisplayName("Record 4147: Email is antone@stiman.com")
	void EmailOfRecord4147() {
		assertEquals("antone@stiman.com", customers.get(4146).getEmail());
	}

	@Test
	@DisplayName("Record 4147: Web is http://www.antonestiman.com")
	void WebOfRecord4147() {
		assertEquals("http://www.antonestiman.com", customers.get(4146).getWeb());
	}
}
