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

@Tag("24")
class Record_4687 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4687: FirstName is Katharine")
	void FirstNameOfRecord4687() {
		assertEquals("Katharine", customers.get(4686).getFirstName());
	}

	@Test
	@DisplayName("Record 4687: LastName is Prueter")
	void LastNameOfRecord4687() {
		assertEquals("Prueter", customers.get(4686).getLastName());
	}

	@Test
	@DisplayName("Record 4687: Company is Ripoli, Christine M Esq")
	void CompanyOfRecord4687() {
		assertEquals("Ripoli, Christine M Esq", customers.get(4686).getCompany());
	}

	@Test
	@DisplayName("Record 4687: Address is 3135 39th Ave N  #-10")
	void AddressOfRecord4687() {
		assertEquals("3135 39th Ave N  #-10", customers.get(4686).getAddress());
	}

	@Test
	@DisplayName("Record 4687: City is Saint Petersburg")
	void CityOfRecord4687() {
		assertEquals("Saint Petersburg", customers.get(4686).getCity());
	}

	@Test
	@DisplayName("Record 4687: County is Pinellas")
	void CountyOfRecord4687() {
		assertEquals("Pinellas", customers.get(4686).getCounty());
	}

	@Test
	@DisplayName("Record 4687: State is FL")
	void StateOfRecord4687() {
		assertEquals("FL", customers.get(4686).getState());
	}

	@Test
	@DisplayName("Record 4687: ZIP is 33714")
	void ZIPOfRecord4687() {
		assertEquals("33714", customers.get(4686).getZIP());
	}

	@Test
	@DisplayName("Record 4687: Phone is 727-522-2667")
	void PhoneOfRecord4687() {
		assertEquals("727-522-2667", customers.get(4686).getPhone());
	}

	@Test
	@DisplayName("Record 4687: Fax is 727-522-6865")
	void FaxOfRecord4687() {
		assertEquals("727-522-6865", customers.get(4686).getFax());
	}

	@Test
	@DisplayName("Record 4687: Email is katharine@prueter.com")
	void EmailOfRecord4687() {
		assertEquals("katharine@prueter.com", customers.get(4686).getEmail());
	}

	@Test
	@DisplayName("Record 4687: Web is http://www.katharineprueter.com")
	void WebOfRecord4687() {
		assertEquals("http://www.katharineprueter.com", customers.get(4686).getWeb());
	}
}
