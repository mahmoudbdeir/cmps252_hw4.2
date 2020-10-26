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

@Tag("3")
class Record_3283 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3283: FirstName is Joesph")
	void FirstNameOfRecord3283() {
		assertEquals("Joesph", customers.get(3282).getFirstName());
	}

	@Test
	@DisplayName("Record 3283: LastName is Norat")
	void LastNameOfRecord3283() {
		assertEquals("Norat", customers.get(3282).getLastName());
	}

	@Test
	@DisplayName("Record 3283: Company is Swichkow, Morton C Esq")
	void CompanyOfRecord3283() {
		assertEquals("Swichkow, Morton C Esq", customers.get(3282).getCompany());
	}

	@Test
	@DisplayName("Record 3283: Address is 331 Aaron Ave")
	void AddressOfRecord3283() {
		assertEquals("331 Aaron Ave", customers.get(3282).getAddress());
	}

	@Test
	@DisplayName("Record 3283: City is Arlington")
	void CityOfRecord3283() {
		assertEquals("Arlington", customers.get(3282).getCity());
	}

	@Test
	@DisplayName("Record 3283: County is Tarrant")
	void CountyOfRecord3283() {
		assertEquals("Tarrant", customers.get(3282).getCounty());
	}

	@Test
	@DisplayName("Record 3283: State is TX")
	void StateOfRecord3283() {
		assertEquals("TX", customers.get(3282).getState());
	}

	@Test
	@DisplayName("Record 3283: ZIP is 76012")
	void ZIPOfRecord3283() {
		assertEquals("76012", customers.get(3282).getZIP());
	}

	@Test
	@DisplayName("Record 3283: Phone is 817-274-7842")
	void PhoneOfRecord3283() {
		assertEquals("817-274-7842", customers.get(3282).getPhone());
	}

	@Test
	@DisplayName("Record 3283: Fax is 817-274-9366")
	void FaxOfRecord3283() {
		assertEquals("817-274-9366", customers.get(3282).getFax());
	}

	@Test
	@DisplayName("Record 3283: Email is joesph@norat.com")
	void EmailOfRecord3283() {
		assertEquals("joesph@norat.com", customers.get(3282).getEmail());
	}

	@Test
	@DisplayName("Record 3283: Web is http://www.joesphnorat.com")
	void WebOfRecord3283() {
		assertEquals("http://www.joesphnorat.com", customers.get(3282).getWeb());
	}
}
