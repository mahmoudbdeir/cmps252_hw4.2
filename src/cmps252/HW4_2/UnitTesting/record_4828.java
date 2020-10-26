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
class Record_4828 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4828: FirstName is Nilda")
	void FirstNameOfRecord4828() {
		assertEquals("Nilda", customers.get(4827).getFirstName());
	}

	@Test
	@DisplayName("Record 4828: LastName is Tesmer")
	void LastNameOfRecord4828() {
		assertEquals("Tesmer", customers.get(4827).getLastName());
	}

	@Test
	@DisplayName("Record 4828: Company is United Construction Corp")
	void CompanyOfRecord4828() {
		assertEquals("United Construction Corp", customers.get(4827).getCompany());
	}

	@Test
	@DisplayName("Record 4828: Address is 115 Ryan Industrial Ct  #-110")
	void AddressOfRecord4828() {
		assertEquals("115 Ryan Industrial Ct  #-110", customers.get(4827).getAddress());
	}

	@Test
	@DisplayName("Record 4828: City is San Ramon")
	void CityOfRecord4828() {
		assertEquals("San Ramon", customers.get(4827).getCity());
	}

	@Test
	@DisplayName("Record 4828: County is Contra Costa")
	void CountyOfRecord4828() {
		assertEquals("Contra Costa", customers.get(4827).getCounty());
	}

	@Test
	@DisplayName("Record 4828: State is CA")
	void StateOfRecord4828() {
		assertEquals("CA", customers.get(4827).getState());
	}

	@Test
	@DisplayName("Record 4828: ZIP is 94583")
	void ZIPOfRecord4828() {
		assertEquals("94583", customers.get(4827).getZIP());
	}

	@Test
	@DisplayName("Record 4828: Phone is 925-820-0414")
	void PhoneOfRecord4828() {
		assertEquals("925-820-0414", customers.get(4827).getPhone());
	}

	@Test
	@DisplayName("Record 4828: Fax is 925-820-5707")
	void FaxOfRecord4828() {
		assertEquals("925-820-5707", customers.get(4827).getFax());
	}

	@Test
	@DisplayName("Record 4828: Email is nilda@tesmer.com")
	void EmailOfRecord4828() {
		assertEquals("nilda@tesmer.com", customers.get(4827).getEmail());
	}

	@Test
	@DisplayName("Record 4828: Web is http://www.nildatesmer.com")
	void WebOfRecord4828() {
		assertEquals("http://www.nildatesmer.com", customers.get(4827).getWeb());
	}
}
