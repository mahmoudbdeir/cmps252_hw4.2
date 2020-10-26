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

@Tag("44")
class Record_3933 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3933: FirstName is Lynnette")
	void FirstNameOfRecord3933() {
		assertEquals("Lynnette", customers.get(3932).getFirstName());
	}

	@Test
	@DisplayName("Record 3933: LastName is Boteler")
	void LastNameOfRecord3933() {
		assertEquals("Boteler", customers.get(3932).getLastName());
	}

	@Test
	@DisplayName("Record 3933: Company is Advantage Home Inspections")
	void CompanyOfRecord3933() {
		assertEquals("Advantage Home Inspections", customers.get(3932).getCompany());
	}

	@Test
	@DisplayName("Record 3933: Address is 1000 16th St Nw  #-300")
	void AddressOfRecord3933() {
		assertEquals("1000 16th St Nw  #-300", customers.get(3932).getAddress());
	}

	@Test
	@DisplayName("Record 3933: City is Washington")
	void CityOfRecord3933() {
		assertEquals("Washington", customers.get(3932).getCity());
	}

	@Test
	@DisplayName("Record 3933: County is District of Columbia")
	void CountyOfRecord3933() {
		assertEquals("District of Columbia", customers.get(3932).getCounty());
	}

	@Test
	@DisplayName("Record 3933: State is DC")
	void StateOfRecord3933() {
		assertEquals("DC", customers.get(3932).getState());
	}

	@Test
	@DisplayName("Record 3933: ZIP is 20036")
	void ZIPOfRecord3933() {
		assertEquals("20036", customers.get(3932).getZIP());
	}

	@Test
	@DisplayName("Record 3933: Phone is 202-429-8050")
	void PhoneOfRecord3933() {
		assertEquals("202-429-8050", customers.get(3932).getPhone());
	}

	@Test
	@DisplayName("Record 3933: Fax is 202-429-8966")
	void FaxOfRecord3933() {
		assertEquals("202-429-8966", customers.get(3932).getFax());
	}

	@Test
	@DisplayName("Record 3933: Email is lynnette@boteler.com")
	void EmailOfRecord3933() {
		assertEquals("lynnette@boteler.com", customers.get(3932).getEmail());
	}

	@Test
	@DisplayName("Record 3933: Web is http://www.lynnetteboteler.com")
	void WebOfRecord3933() {
		assertEquals("http://www.lynnetteboteler.com", customers.get(3932).getWeb());
	}
}
