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

@Tag("26")
class Record_3605 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3605: FirstName is Efren")
	void FirstNameOfRecord3605() {
		assertEquals("Efren", customers.get(3604).getFirstName());
	}

	@Test
	@DisplayName("Record 3605: LastName is Labbadia")
	void LastNameOfRecord3605() {
		assertEquals("Labbadia", customers.get(3604).getLastName());
	}

	@Test
	@DisplayName("Record 3605: Company is Phoenix Chemical Labtry Inc")
	void CompanyOfRecord3605() {
		assertEquals("Phoenix Chemical Labtry Inc", customers.get(3604).getCompany());
	}

	@Test
	@DisplayName("Record 3605: Address is 3901 W Pioneer Pky")
	void AddressOfRecord3605() {
		assertEquals("3901 W Pioneer Pky", customers.get(3604).getAddress());
	}

	@Test
	@DisplayName("Record 3605: City is Arlington")
	void CityOfRecord3605() {
		assertEquals("Arlington", customers.get(3604).getCity());
	}

	@Test
	@DisplayName("Record 3605: County is Tarrant")
	void CountyOfRecord3605() {
		assertEquals("Tarrant", customers.get(3604).getCounty());
	}

	@Test
	@DisplayName("Record 3605: State is TX")
	void StateOfRecord3605() {
		assertEquals("TX", customers.get(3604).getState());
	}

	@Test
	@DisplayName("Record 3605: ZIP is 76013")
	void ZIPOfRecord3605() {
		assertEquals("76013", customers.get(3604).getZIP());
	}

	@Test
	@DisplayName("Record 3605: Phone is 817-459-7234")
	void PhoneOfRecord3605() {
		assertEquals("817-459-7234", customers.get(3604).getPhone());
	}

	@Test
	@DisplayName("Record 3605: Fax is 817-459-7157")
	void FaxOfRecord3605() {
		assertEquals("817-459-7157", customers.get(3604).getFax());
	}

	@Test
	@DisplayName("Record 3605: Email is efren@labbadia.com")
	void EmailOfRecord3605() {
		assertEquals("efren@labbadia.com", customers.get(3604).getEmail());
	}

	@Test
	@DisplayName("Record 3605: Web is http://www.efrenlabbadia.com")
	void WebOfRecord3605() {
		assertEquals("http://www.efrenlabbadia.com", customers.get(3604).getWeb());
	}
}
