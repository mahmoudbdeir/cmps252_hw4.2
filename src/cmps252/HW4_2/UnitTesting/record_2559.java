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
class Record_2559 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2559: FirstName is Karina")
	void FirstNameOfRecord2559() {
		assertEquals("Karina", customers.get(2558).getFirstName());
	}

	@Test
	@DisplayName("Record 2559: LastName is Schielke")
	void LastNameOfRecord2559() {
		assertEquals("Schielke", customers.get(2558).getLastName());
	}

	@Test
	@DisplayName("Record 2559: Company is Gen Instr Corp Videocipher Div")
	void CompanyOfRecord2559() {
		assertEquals("Gen Instr Corp Videocipher Div", customers.get(2558).getCompany());
	}

	@Test
	@DisplayName("Record 2559: Address is 222 W Adams St  #-25")
	void AddressOfRecord2559() {
		assertEquals("222 W Adams St  #-25", customers.get(2558).getAddress());
	}

	@Test
	@DisplayName("Record 2559: City is Chicago")
	void CityOfRecord2559() {
		assertEquals("Chicago", customers.get(2558).getCity());
	}

	@Test
	@DisplayName("Record 2559: County is Cook")
	void CountyOfRecord2559() {
		assertEquals("Cook", customers.get(2558).getCounty());
	}

	@Test
	@DisplayName("Record 2559: State is IL")
	void StateOfRecord2559() {
		assertEquals("IL", customers.get(2558).getState());
	}

	@Test
	@DisplayName("Record 2559: ZIP is 60606")
	void ZIPOfRecord2559() {
		assertEquals("60606", customers.get(2558).getZIP());
	}

	@Test
	@DisplayName("Record 2559: Phone is 312-648-9236")
	void PhoneOfRecord2559() {
		assertEquals("312-648-9236", customers.get(2558).getPhone());
	}

	@Test
	@DisplayName("Record 2559: Fax is 312-648-5132")
	void FaxOfRecord2559() {
		assertEquals("312-648-5132", customers.get(2558).getFax());
	}

	@Test
	@DisplayName("Record 2559: Email is karina@schielke.com")
	void EmailOfRecord2559() {
		assertEquals("karina@schielke.com", customers.get(2558).getEmail());
	}

	@Test
	@DisplayName("Record 2559: Web is http://www.karinaschielke.com")
	void WebOfRecord2559() {
		assertEquals("http://www.karinaschielke.com", customers.get(2558).getWeb());
	}
}
