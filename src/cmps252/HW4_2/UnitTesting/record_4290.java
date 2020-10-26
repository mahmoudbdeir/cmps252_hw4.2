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

@Tag("29")
class Record_4290 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4290: FirstName is Patricia")
	void FirstNameOfRecord4290() {
		assertEquals("Patricia", customers.get(4289).getFirstName());
	}

	@Test
	@DisplayName("Record 4290: LastName is Zynda")
	void LastNameOfRecord4290() {
		assertEquals("Zynda", customers.get(4289).getLastName());
	}

	@Test
	@DisplayName("Record 4290: Company is Auto Comm Engineering Corp")
	void CompanyOfRecord4290() {
		assertEquals("Auto Comm Engineering Corp", customers.get(4289).getCompany());
	}

	@Test
	@DisplayName("Record 4290: Address is 205207 N Washington Ave")
	void AddressOfRecord4290() {
		assertEquals("205207 N Washington Ave", customers.get(4289).getAddress());
	}

	@Test
	@DisplayName("Record 4290: City is Scranton")
	void CityOfRecord4290() {
		assertEquals("Scranton", customers.get(4289).getCity());
	}

	@Test
	@DisplayName("Record 4290: County is Lackawanna")
	void CountyOfRecord4290() {
		assertEquals("Lackawanna", customers.get(4289).getCounty());
	}

	@Test
	@DisplayName("Record 4290: State is PA")
	void StateOfRecord4290() {
		assertEquals("PA", customers.get(4289).getState());
	}

	@Test
	@DisplayName("Record 4290: ZIP is 18503")
	void ZIPOfRecord4290() {
		assertEquals("18503", customers.get(4289).getZIP());
	}

	@Test
	@DisplayName("Record 4290: Phone is 570-348-8924")
	void PhoneOfRecord4290() {
		assertEquals("570-348-8924", customers.get(4289).getPhone());
	}

	@Test
	@DisplayName("Record 4290: Fax is 570-348-3676")
	void FaxOfRecord4290() {
		assertEquals("570-348-3676", customers.get(4289).getFax());
	}

	@Test
	@DisplayName("Record 4290: Email is patricia@zynda.com")
	void EmailOfRecord4290() {
		assertEquals("patricia@zynda.com", customers.get(4289).getEmail());
	}

	@Test
	@DisplayName("Record 4290: Web is http://www.patriciazynda.com")
	void WebOfRecord4290() {
		assertEquals("http://www.patriciazynda.com", customers.get(4289).getWeb());
	}
}
