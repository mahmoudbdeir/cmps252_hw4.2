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
class Record_4887 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4887: FirstName is Rosanne")
	void FirstNameOfRecord4887() {
		assertEquals("Rosanne", customers.get(4886).getFirstName());
	}

	@Test
	@DisplayName("Record 4887: LastName is Turnbough")
	void LastNameOfRecord4887() {
		assertEquals("Turnbough", customers.get(4886).getLastName());
	}

	@Test
	@DisplayName("Record 4887: Company is Judo Constr Co Inc")
	void CompanyOfRecord4887() {
		assertEquals("Judo Constr Co Inc", customers.get(4886).getCompany());
	}

	@Test
	@DisplayName("Record 4887: Address is 6701 Penn Ave S")
	void AddressOfRecord4887() {
		assertEquals("6701 Penn Ave S", customers.get(4886).getAddress());
	}

	@Test
	@DisplayName("Record 4887: City is Minneapolis")
	void CityOfRecord4887() {
		assertEquals("Minneapolis", customers.get(4886).getCity());
	}

	@Test
	@DisplayName("Record 4887: County is Hennepin")
	void CountyOfRecord4887() {
		assertEquals("Hennepin", customers.get(4886).getCounty());
	}

	@Test
	@DisplayName("Record 4887: State is MN")
	void StateOfRecord4887() {
		assertEquals("MN", customers.get(4886).getState());
	}

	@Test
	@DisplayName("Record 4887: ZIP is 55423")
	void ZIPOfRecord4887() {
		assertEquals("55423", customers.get(4886).getZIP());
	}

	@Test
	@DisplayName("Record 4887: Phone is 612-866-1467")
	void PhoneOfRecord4887() {
		assertEquals("612-866-1467", customers.get(4886).getPhone());
	}

	@Test
	@DisplayName("Record 4887: Fax is 612-866-6762")
	void FaxOfRecord4887() {
		assertEquals("612-866-6762", customers.get(4886).getFax());
	}

	@Test
	@DisplayName("Record 4887: Email is rosanne@turnbough.com")
	void EmailOfRecord4887() {
		assertEquals("rosanne@turnbough.com", customers.get(4886).getEmail());
	}

	@Test
	@DisplayName("Record 4887: Web is http://www.rosanneturnbough.com")
	void WebOfRecord4887() {
		assertEquals("http://www.rosanneturnbough.com", customers.get(4886).getWeb());
	}
}
