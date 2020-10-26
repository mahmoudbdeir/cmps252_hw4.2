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
class Record_2737 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2737: FirstName is Dennis")
	void FirstNameOfRecord2737() {
		assertEquals("Dennis", customers.get(2736).getFirstName());
	}

	@Test
	@DisplayName("Record 2737: LastName is Ebach")
	void LastNameOfRecord2737() {
		assertEquals("Ebach", customers.get(2736).getLastName());
	}

	@Test
	@DisplayName("Record 2737: Company is Diamond Packaging")
	void CompanyOfRecord2737() {
		assertEquals("Diamond Packaging", customers.get(2736).getCompany());
	}

	@Test
	@DisplayName("Record 2737: Address is 212 Pleasantview Ave")
	void AddressOfRecord2737() {
		assertEquals("212 Pleasantview Ave", customers.get(2736).getAddress());
	}

	@Test
	@DisplayName("Record 2737: City is Schwenksville")
	void CityOfRecord2737() {
		assertEquals("Schwenksville", customers.get(2736).getCity());
	}

	@Test
	@DisplayName("Record 2737: County is Montgomery")
	void CountyOfRecord2737() {
		assertEquals("Montgomery", customers.get(2736).getCounty());
	}

	@Test
	@DisplayName("Record 2737: State is PA")
	void StateOfRecord2737() {
		assertEquals("PA", customers.get(2736).getState());
	}

	@Test
	@DisplayName("Record 2737: ZIP is 19473")
	void ZIPOfRecord2737() {
		assertEquals("19473", customers.get(2736).getZIP());
	}

	@Test
	@DisplayName("Record 2737: Phone is 610-287-9962")
	void PhoneOfRecord2737() {
		assertEquals("610-287-9962", customers.get(2736).getPhone());
	}

	@Test
	@DisplayName("Record 2737: Fax is 610-287-7035")
	void FaxOfRecord2737() {
		assertEquals("610-287-7035", customers.get(2736).getFax());
	}

	@Test
	@DisplayName("Record 2737: Email is dennis@ebach.com")
	void EmailOfRecord2737() {
		assertEquals("dennis@ebach.com", customers.get(2736).getEmail());
	}

	@Test
	@DisplayName("Record 2737: Web is http://www.dennisebach.com")
	void WebOfRecord2737() {
		assertEquals("http://www.dennisebach.com", customers.get(2736).getWeb());
	}
}
