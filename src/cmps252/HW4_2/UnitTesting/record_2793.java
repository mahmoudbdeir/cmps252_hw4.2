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

@Tag("15")
class Record_2793 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2793: FirstName is Kathrine")
	void FirstNameOfRecord2793() {
		assertEquals("Kathrine", customers.get(2792).getFirstName());
	}

	@Test
	@DisplayName("Record 2793: LastName is Grimstead")
	void LastNameOfRecord2793() {
		assertEquals("Grimstead", customers.get(2792).getLastName());
	}

	@Test
	@DisplayName("Record 2793: Company is Image Copy Systems Inc")
	void CompanyOfRecord2793() {
		assertEquals("Image Copy Systems Inc", customers.get(2792).getCompany());
	}

	@Test
	@DisplayName("Record 2793: Address is 1020 Piikoi St")
	void AddressOfRecord2793() {
		assertEquals("1020 Piikoi St", customers.get(2792).getAddress());
	}

	@Test
	@DisplayName("Record 2793: City is Honolulu")
	void CityOfRecord2793() {
		assertEquals("Honolulu", customers.get(2792).getCity());
	}

	@Test
	@DisplayName("Record 2793: County is Honolulu")
	void CountyOfRecord2793() {
		assertEquals("Honolulu", customers.get(2792).getCounty());
	}

	@Test
	@DisplayName("Record 2793: State is HI")
	void StateOfRecord2793() {
		assertEquals("HI", customers.get(2792).getState());
	}

	@Test
	@DisplayName("Record 2793: ZIP is 96814")
	void ZIPOfRecord2793() {
		assertEquals("96814", customers.get(2792).getZIP());
	}

	@Test
	@DisplayName("Record 2793: Phone is 808-591-0474")
	void PhoneOfRecord2793() {
		assertEquals("808-591-0474", customers.get(2792).getPhone());
	}

	@Test
	@DisplayName("Record 2793: Fax is 808-591-0463")
	void FaxOfRecord2793() {
		assertEquals("808-591-0463", customers.get(2792).getFax());
	}

	@Test
	@DisplayName("Record 2793: Email is kathrine@grimstead.com")
	void EmailOfRecord2793() {
		assertEquals("kathrine@grimstead.com", customers.get(2792).getEmail());
	}

	@Test
	@DisplayName("Record 2793: Web is http://www.kathrinegrimstead.com")
	void WebOfRecord2793() {
		assertEquals("http://www.kathrinegrimstead.com", customers.get(2792).getWeb());
	}
}
