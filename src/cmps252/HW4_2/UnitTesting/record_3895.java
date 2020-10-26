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

@Tag("34")
class Record_3895 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3895: FirstName is Jami")
	void FirstNameOfRecord3895() {
		assertEquals("Jami", customers.get(3894).getFirstName());
	}

	@Test
	@DisplayName("Record 3895: LastName is Rolin")
	void LastNameOfRecord3895() {
		assertEquals("Rolin", customers.get(3894).getLastName());
	}

	@Test
	@DisplayName("Record 3895: Company is National Lub Grease Inst")
	void CompanyOfRecord3895() {
		assertEquals("National Lub Grease Inst", customers.get(3894).getCompany());
	}

	@Test
	@DisplayName("Record 3895: Address is 20039 Highway 99")
	void AddressOfRecord3895() {
		assertEquals("20039 Highway 99", customers.get(3894).getAddress());
	}

	@Test
	@DisplayName("Record 3895: City is Lynnwood")
	void CityOfRecord3895() {
		assertEquals("Lynnwood", customers.get(3894).getCity());
	}

	@Test
	@DisplayName("Record 3895: County is Snohomish")
	void CountyOfRecord3895() {
		assertEquals("Snohomish", customers.get(3894).getCounty());
	}

	@Test
	@DisplayName("Record 3895: State is WA")
	void StateOfRecord3895() {
		assertEquals("WA", customers.get(3894).getState());
	}

	@Test
	@DisplayName("Record 3895: ZIP is 98036")
	void ZIPOfRecord3895() {
		assertEquals("98036", customers.get(3894).getZIP());
	}

	@Test
	@DisplayName("Record 3895: Phone is 425-776-7464")
	void PhoneOfRecord3895() {
		assertEquals("425-776-7464", customers.get(3894).getPhone());
	}

	@Test
	@DisplayName("Record 3895: Fax is 425-776-5974")
	void FaxOfRecord3895() {
		assertEquals("425-776-5974", customers.get(3894).getFax());
	}

	@Test
	@DisplayName("Record 3895: Email is jami@rolin.com")
	void EmailOfRecord3895() {
		assertEquals("jami@rolin.com", customers.get(3894).getEmail());
	}

	@Test
	@DisplayName("Record 3895: Web is http://www.jamirolin.com")
	void WebOfRecord3895() {
		assertEquals("http://www.jamirolin.com", customers.get(3894).getWeb());
	}
}
